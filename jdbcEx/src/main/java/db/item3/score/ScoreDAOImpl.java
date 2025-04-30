package db.item3.score;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.util.DBConn;
import db.util.DBUtil;

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
    :프로시저 실행 


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
	public void insertScore(ScoreDTO dto) throws SQLException {
		PreparedStatement pstmt = null;
		String sql;
		
		// INSERT INTO 테이블명(컬럼명, 컬럼명) VALUES(값, 값)
		try {
			// 1) 쿼리를 만든다.
			sql = "INSERT INTO score(hak, name, birth, kor, eng, mat) "
					+ " VALUES (?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?)";
			
			// 2) 쿼리를 인자로 PreparedStatement 객체를 생성한다.
			pstmt = conn.prepareStatement(sql);
			
			// 3) setter 를 이용하여 ?에 값을 할당한다.
			pstmt.setString(1, dto.getHak());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getBirth());
			pstmt.setInt(4, dto.getKor());
			pstmt.setInt(5, dto.getEng());
			pstmt.setInt(6, dto.getMat());
			
			// 4) 쿼리를 실행한다. 쿼리를 실행할 때 인자에 쿼리를 전달하지 않는다.
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			throw e;
		} finally {
			DBUtil.close(pstmt);
		}
		
	}

	@Override
	public void updateScore(ScoreDTO dto) throws SQLException {
		
		
	}

	@Override
	public void deleteScore(String hak) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ScoreDTO findById(String hak) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScoreDTO> listScore() {
		List<ScoreDTO> list = new ArrayList<ScoreDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		// SELECT 컬럼, 컬럼 FROM 테이블 [WHERE 조건]
		try {
			sql = "SELECT hak, name, birth, kor, eng, mat, "
					+ " kor+eng+mat tot, (kor+eng+mat)/3 ave "
					+ " FROM score "
					+ " ORDER BY hak";
			
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ScoreDTO dto = new ScoreDTO();
				
				dto.setHak(rs.getString("hak"));
				dto.setName(rs.getString("name"));
				dto.setBirth(rs.getDate("birth").toString());
					// rs.getDate("컬럼") : java.sql.Date 를 반환
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
				dto.setTot(rs.getInt("tot"));
				dto.setAve(rs.getInt("ave"));
				
				list.add(dto); // List 객체에 ScoreDTO 객체를 저장
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
		
		return list;
	}

	@Override
	public List<ScoreDTO> listScore(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
