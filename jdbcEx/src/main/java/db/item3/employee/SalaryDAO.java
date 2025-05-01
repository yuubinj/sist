package db.item3.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import db.util.DBConn;
import db.util.DBUtil;

public class SalaryDAO {
	private Connection conn = DBConn.getConnection();
	
	public int insertSalary(SalaryDTO dto) throws SQLException {
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;
		
		try {
			sql = "INSERT INTO salary(salaryNum, sabeon, payDate, paymentDate, pay, sudang, tax, memo) "
					+ " VALUES (salary_seq.nextVal, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?, ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getSabeon());
			pstmt.setString(2, dto.getPayDate());
			pstmt.setString(3, dto.getPaymentDate());
			pstmt.setInt(4, dto.getPay());
			pstmt.setInt(5, dto.getSudang());
			pstmt.setInt(6, dto.getTax());
			pstmt.setString(7, dto.getMemo());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
		}
		
		return result;
	}
	
	public int updateSalary(SalaryDTO dto) throws SQLException {
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;
		
		try {
			sql = "UPDATE salary SET payDate = ?, " 
					+ " paymentDate = ?, pay = ?, sudang = ?, tax = ?, memo = ? "
					+ " salaryNum = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getPayDate());
			pstmt.setString(2, dto.getPaymentDate());
			pstmt.setInt(3, dto.getPay());
			pstmt.setInt(4, dto.getSudang());
			pstmt.setInt(5, dto.getTax());
			pstmt.setString(6, dto.getMemo());
			pstmt.setInt(7, dto.getSalaryNum());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
		}
		
		return result;
	}

	public int deleteSalary(int salaryNum) throws SQLException {
		PreparedStatement pstmt = null;
		String sql;
		int result = 0;
		
		try {
			sql = "DELETE FROM salary WHERE salaryNum = ? ";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, salaryNum);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(pstmt);
		}

		return result;
	}
	
	public SalaryDTO readSalary(int salaryNum) {
		SalaryDTO dto = null;
		
		return dto;
	}
	
	public List<SalaryDTO> listSalary(String payDate) {
		List<SalaryDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		String sql;
		ResultSet rs = null;
		
		try {
			sql = "SELECT salaryNum, s.sabeon, name, payDate, "
					+ " TO_CHAR(paymentDate, 'YYYY-MM-DD') paymentDate, pay, sudang, "
					+ " (pay+sudang) tot, tax, (pay+sudang-tax) afterPay "
					+ " FROM salary s"
					+ " RIGHT OUTER JOIN employee e"
					+ " ON s.sabeon = e.sabeon"
					+ " WHERE payDate = ? "
					+ " ORDER BY payDate DESC";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, payDate);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SalaryDTO dto = new SalaryDTO();
				
				dto.setSalaryNum(rs.getInt("salaryNum"));
				dto.setSabeon(rs.getString("sabeon"));
				dto.setName(rs.getString("name"));
				dto.setPayDate(rs.getString("payDate"));
				dto.setPaymentDate(rs.getString("paymentDate"));
				dto.setPay(rs.getInt("pay"));
				dto.setSudang(rs.getInt("sudang"));
				dto.setTot(rs.getInt("tot"));
				dto.setTax(rs.getInt("tax"));
				dto.setAfterPay(rs.getInt("afterPay"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
		
		
		return list;
	}
	
	public List<SalaryDTO> listSalary(Map<String, Object> map) {
		List<SalaryDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "SELECT salaryNum, s.sabeon, name, payDate, "
					+ " TO_CHAR(paymentDate, 'YYYY-MM-DD') paymentDate, pay, sudang, "
					+ " (pay+sudang) tot"
					+ " FROM salary s"
					+ " RIGHT OUTER JOIN employee e"
					+ " ON s.sabeon = e.sabeon"
					+ " WHERE s.sabeon = ? AND payDate = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) map.get("사원번호"));
			pstmt.setString(2, (String) map.get("급여년월"));
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SalaryDTO dto = new SalaryDTO();
				
				dto.setSalaryNum(rs.getInt("salaryNum"));
				dto.setSabeon(rs.getString("sabeon"));
				dto.setName(rs.getString("name"));
				dto.setPayDate(rs.getString("payDate"));
				dto.setPaymentDate(rs.getString("paymentDate"));
				dto.setPay(rs.getInt("pay"));
				dto.setSudang(rs.getInt("sudang"));
				dto.setTot(rs.getInt("tot"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();;
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
		
		return list;
	}

	public List<SalaryDTO> listSalary() {
		List<SalaryDTO> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql;
		
		try {
			sql = "SELECT salaryNum, s.sabeon, name, payDate, "
					+ " TO_CHAR(paymentDate, 'YYYY-MM-DD') paymentDate, pay, sudang, "
					+ " (pay+sudang) tot"
					+ " FROM salary s"
					+ " RIGHT OUTER JOIN employee e"
					+ " ON s.sabeon = e.sabeon";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				SalaryDTO dto = new SalaryDTO();
				
				dto.setSalaryNum(rs.getInt("salaryNum"));
				dto.setSabeon(rs.getString("sabeon"));
				dto.setName(rs.getString("name"));
				dto.setPayDate(rs.getString("payDate"));
				dto.setPaymentDate(rs.getString("paymentDate"));
				dto.setPay(rs.getInt("pay"));
				dto.setSudang(rs.getInt("sudang"));
				dto.setTot(rs.getInt("tot"));
				
				list.add(dto);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(pstmt);
		}
		
		return list;
	}

}
