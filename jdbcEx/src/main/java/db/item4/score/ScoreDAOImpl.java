package db.item4.score;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.util.DBConn;
import db.util.DBUtil;
import oracle.jdbc.OracleTypes;

/*
※ JDBC 프로그램 작성

● 용어 
    - CRUD
      Create, Retrieve, Update, Delete의 앞 글자를 따온 단어
    - DTO(Data Transfer Object)
      데이터 전송 객체(VO : Value Object 라고도 함)
    - DAO(Data Access Object)
      insert, update, delete, select 등 데이터 처리를 주 목적으로 하는 클래스


● 쿼리실행
  - Statement
    : 정적쿼리실행. 보안 취약. 잘 사용하지 않음
    : SQL Injection(SQL 주입) 공격이 가능하므로 절대로 사용해서는 안된다.
    : 필요시 자바에서 트랜잭션 처리를 해야함
  - PreparedStatement
    : Statement의 하위 인터페이스.
    : 선행 컴파일.
    : 반복작업에서는 속도 빠름.
    : 가장 많이 사용
    : 필요시 자바에서 트랜잭션 처리를 해야함
  - CallableStatement
    : 프로시저 실행 
    : 트랜잭션은 프로시저에서 처리


● PreparedStatement 주요 메소드
   1. executeUpdate()
       DML(INSERT, UPDATE, DELETE), DDL(CREATE, ALTER, DROP 등) 을 실행한다.
       DML은 실행 행수를 리턴하며, DDL은 0을 리턴 한다.
      
   2. executeQuery()
       SELECT 문을 실행하며 ResultSet 객체를 리턴한다.

   3. 필요시 자바에서 트랜잭션 처리를 해야한다.


● JDBC 프로그램 작성 순성
    1. DriverManager.getConnection() 을 이용하여 Connection 객체 얻어오기
    2. 쿼리문(sql) 작성
    3. Connection 객체에서 prepareStatement(String sql) 메소드를 호출하여 
        PreparedStatement 객체를 얻어온다.
    4. 쿼리문의 IN 파라미터를 setter를 이용하여 설정한다.
    5. PreparedStatement 의 executeUpdate() 또는 executeQuery() 메소드로 쿼리 실행
        executeUpdate() : SELECT문 이외의 구문 실행
        executeQuery() : SELECT문 실행
    6. close()


●  주요 예외 클래스
   1. SQLIntegrityConstraintViolationException
       - SQLException 하위 클래스
       - 기본키 중복, NOT NULL등의 제약조건 위반에 의한 예외 발생-무결성 제약 조건 위반
       - getErrorCode()
         1 : 기본키 제약 위반
         2291 : 참조키 제약 위반
         1400 : INSERT에서 NOT NULL 제약 위반
         1407 : UPDATE에서 NOT NULL 제약 위반, 1407은 SQLException 에서 예외 처리 해야 함

   2. SQLDataException
       - SQLException 하위 클래스
       - 날짜등의 형식 잘못으로 인한 예외
       - getErrorCode()
         1840, 1847, 1861 : 날짜 입력 형식 위반
         1438 : 폭보다 숫자 길이가 큰경우 
   3. SQLException
       - 데이터베이스 액세스 에러 및 그 외의 에러에 대한 정보를 제공하는 예외
       - getErrorCode()
         12899 : 열폭이 보다 문자열 길이가 큰경우
         00918 : 열정의가 애매합니다. JOIN 에서 동일한 컬럼명이 두개 이상인 경우
         00911 : 쿼리의 마지막에 「;」이 있는 경우이므로 「;」를 지운다.		


●  주의 사항
   - 자바에서 DML(INSERT, UPDATE, DELETE) 작업시 기본적으로 자동 COMMIT

   - 컬럼값이 null 상태에서 Integer kor에 kor = rs.getInt("kor"); 는 0으로 대입이 되다.
      이런 경우 컬럼 값의 null 여부 판단은
      if(rs.getObject("kor")!=null) {
            kor = rs.getInt("kor");
      }
     처럼 코딩 한다.

  - SQL Developer에서 INSERT, UPDATE, DELETE 후 반드시 COMMIT 또는 ROLLBACK 하기
   
*/

public class ScoreDAOImpl implements ScoreDAO {
	private Connection conn = DBConn.getConnection();

	@Override
	public int insertScore(ScoreDTO dto) throws SQLException {
		CallableStatement cstmt = null;
		String sql;
		int result = 0;
		
		try {
			// 1) 프로시저를 실행하는 쿼리 작성 - 자바에서는 CALL 로 프로시저 실행
			// ? 의 개수는 프로시저의 IN 또는 OUT 파라미터의 개수 만큼 기술한다.
			sql = "{ CALL insertScore(?,?,TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?) }";
			
			// 2) 쿼리를 인자로 CallableStatement 객체를 생성한다.
			cstmt = conn.prepareCall(sql);
			
			// 3) setter 를 이용하여 ?에 값을 할당한다.
			cstmt.setString(1, dto.getHak());
			cstmt.setString(2, dto.getName());
			cstmt.setString(3, dto.getBirth());
			cstmt.setInt(4, dto.getKor());
			cstmt.setInt(5, dto.getEng());
			cstmt.setInt(6, dto.getMat());
			
			// 4) 쿼리를 실행한다. 쿼리를 실행할 때 인자에 쿼리를 전달하지 않는다.
			cstmt.executeUpdate();
			
			result = 1;
			
		} catch (SQLException e) {
			throw e;
		} finally {
			DBUtil.close(cstmt);
		}
		
		return result;
	}

	@Override
	public int updateScore(ScoreDTO dto) throws SQLException {
		CallableStatement cstmt = null;
		String sql;
		int result = 0;
		
		try {
			sql = "CALL updateScore(?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?)";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, dto.getName());
			cstmt.setString(2, dto.getBirth());
			cstmt.setInt(3, dto.getKor());
			cstmt.setInt(4, dto.getEng());
			cstmt.setInt(5, dto.getMat());
			cstmt.setString(6, dto.getHak());
			
			cstmt.executeUpdate();
			
			result = 1;
			
		} catch (SQLException e) {
			throw e;
		} finally {
			DBUtil.close(cstmt);
		}
		
		return result;
	}

	@Override
	public int deleteScore(String hak) throws SQLException {
		CallableStatement cstmt = null;
		String sql;
		int result = 0;
		
		// DELETE FROM 테이블 WHERE 조건
		try {
			sql = "CALL deleteScore(?)";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.setString(1, hak);
			
			cstmt.executeUpdate();
		
			result = 1;
			
		} catch (SQLException e) {
			throw e;
		} finally {
			DBUtil.close(cstmt);
		}
		
		return result;
	}

	@Override
	public ScoreDTO findById(String hak) {
		ScoreDTO dto = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "CALL findById(?,?)";
			cstmt = conn.prepareCall(sql);
			
			// OUT 파라미터는 타입을 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			// IN 파라미터
			cstmt.setString(2, hak);
			
			// 프로시저는 executeUpdate() 로 실행
			cstmt.executeUpdate();
			
			// OUT 파라미터 넘겨 받기
			// 프로시저 SYS_REFCURSOR 는 ResultSet 으로 반환 
			rs = (ResultSet)cstmt.getObject(1);
			
			// 조건에 만족하는 데이터가 없으면 들어오지 않음.
			if(rs.next()) {
				dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setBirth(rs.getString("birth"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(cstmt);
		}
		
		return dto;
	}

	@Override
	public List<ScoreDTO> listScore() {
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "CALL findByAll(?)";
			cstmt = conn.prepareCall(sql);
			
			// OUT 파라미터는 파라미터의 타입을 설정
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			
			// 프로시저 실행
			cstmt.executeUpdate(); // 모든 프로시저는 executeUpdate()로 실행
			
			// OUT 파라미터값 받아오기
			rs = (ResultSet)cstmt.getObject(1);
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setBirth(rs.getString("birth"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				dto.setRank(rs.getInt("rank"));
				
				list.add(dto); // List 객체에 ScoreDTO 객체를 저장
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(cstmt);
		}
		
		return list;
	}

	@Override
	public List<ScoreDTO> listScore(String name) {
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "CALL findByName(?, ?)";
			
			cstmt = conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2, name);
			
			cstmt.executeUpdate();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setBirth(rs.getString("birth"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(cstmt);
		}
		
		return list;
	}

	@Override
	public Map<String, Integer> averageScore() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		CallableStatement cstmt = null;
		String sql;
		
		try {
			sql = "CALL averageScore(?,?,?)";
			cstmt = conn.prepareCall(sql);
			
			// OUT 파라미터 타입 설정
			// 정수인 경우 OracleTypes.INTEGER
			cstmt.registerOutParameter(1, OracleTypes.INTEGER);
			cstmt.registerOutParameter(2, OracleTypes.INTEGER);
			cstmt.registerOutParameter(3, OracleTypes.INTEGER);
			
			cstmt.executeUpdate();
			
			int kor = cstmt.getInt(1);
			int eng = cstmt.getInt(2);
			int mat = cstmt.getInt(3);
			
			map.put("kor", kor);
			map.put("eng", eng);
			map.put("mat", mat);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(cstmt);
		}
		
		return map;
	}
	
}
