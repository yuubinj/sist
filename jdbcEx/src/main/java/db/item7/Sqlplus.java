package db.item7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import db.util.DBConn;
import db.util.DBUtil;

public class Sqlplus {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql, s;
		int n;
		
		gogo:
		while(true) {
			try {
				System.out.print("SQL> ");
				sql = "";
				n = 1;
				
				do {
					s = br.readLine();
					
					if(s == null || s.equalsIgnoreCase("exit")) {
						DBConn.close();
						System.exit(0);
					}
					
					s = s.trim();
					sql += s + "  "; // 공백을 안 주면 다 붙어서
					
					if(sql.trim().length() == 0) { // 엔터만 쳤을 경우 다시 SQL> 로 넘어가도록.
						continue gogo;
					}
					
					if(s.lastIndexOf(";") != s.length() - 1) { // 세미콜론 찍지 않았으면 끝나지 않음. 다음 단락으로 넘어간다.
						System.out.print((++n) + " ");
					}
					
				} while(s.lastIndexOf(";") != s.length()-1);
				
				sql = sql.trim();
				sql = sql.substring(0, sql.length() - 1); // 마지막 ; 제거
				
				if(sql.length() == 0) {
					continue;
				}
				
				execute(sql);
				System.out.println();
			} catch (Exception e) {
			}
		}

	}
	
	public static void execute(String sql) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			if(sql.toUpperCase().startsWith("SELECT")) {
				rs = pstmt.executeQuery();
				rsmd = rs.getMetaData();
				
				int cols = rsmd.getColumnCount();
				
				for(int i=1; i<=cols; i++) {
					System.out.print(rsmd.getColumnName(i) + "\t\t");
				}
				System.out.println();
				
				for(int i=1; i<=cols; i++) {
					System.out.print("------------------");
				}
				System.out.println();
				
				while(rs.next()) {
					for(int i=1; i<=cols; i++) {
						System.out.print(rs.getString(i) + "\t\t");
					}
					System.out.println();
				}
				
			} else {
				int result = pstmt.executeUpdate();
				
				if(sql.toUpperCase().startsWith("INSERT")) {
					System.out.println(result + " 행이 추가되었습니다.");
				} else if (sql.toUpperCase().startsWith("UPDATE")) {
					System.out.println(result + " 행이 수정되었습니다.");
				} else if(sql.toUpperCase().startsWith("DELETE")) {
					System.out.println(result + " 행이 삭제되었습니다.");
				} else {
					System.out.println("쿼리가 실행되었습니다.");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
	}

}
