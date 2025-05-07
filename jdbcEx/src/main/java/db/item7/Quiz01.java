package db.item7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import db.util.DBConn;
import db.util.DBUtil;

public class Quiz01 {

	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sql = null;
		
		try {
			// SELECT * FROM score
			// DELETE FROM score WHERE hak = '1234'
			System.out.print("쿼리 ? ");
			sql = br.readLine();
			sql = sql.trim();
			
			pstmt = conn.prepareStatement(sql);
			if(! sql.toUpperCase().startsWith("SELECT")) {
				pstmt.executeUpdate();
				System.out.println("쿼리가 실행되었습니다.");

				return;
			}
			
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for(int i=1; i<=cols; i++) {
				System.out.print(rsmd.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()) {
				for(int i=1; i<=cols; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
			
			DBConn.close();
		}

	}

}
