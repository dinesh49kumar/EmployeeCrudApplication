package com.crud.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.crud.dao.EmployeeDao;
import com.crud.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	/*DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}*/
	
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return null;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {

	}

	/*@Override
	public void insertEmployee(Employee employee) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = dataSource.getConnection();
			String SQL="insert into employee_table(employee_name,email,sal,dept_no) values(?,?,?,?)";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, employee.getEmployeeName());
			pstmt.setString(2, employee.getEmail());
			pstmt.setDouble(3, employee.getSalary());
			pstmt.setInt(4, employee.getDeptNum());
			
			int update = pstmt.executeUpdate();
			
			if(update > 0) {
				System.out.println("employee object is stored in db successfully....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}*/

	@Override
	public void updateEmployeeMailById(String email, int employeeId) {

	}

	@Override
	public void insertEmployee(Employee employee) {
		String SQL="insert into employee_table(employee_name,email,sal,dept_no) values(?,?,?,?)";
		
		int update = jdbcTemplate.update(SQL, employee.getEmployeeName(), employee.getEmail(), employee.getSalary(), employee.getDeptNum());
		if(update > 0) {
			System.out.println("employee object is stored in db successfully....");
		}
	}
}
