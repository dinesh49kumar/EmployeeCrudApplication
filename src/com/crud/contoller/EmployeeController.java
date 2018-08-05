package com.crud.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crud.model.Employee;
import com.crud.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
//	public ModelAndView welcome() {
		public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		String name=request.getParameter("name");
		String email=request.getParameter("emailid");
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		Employee employee = new Employee();
		employee.setEmployeeName(name);
		employee.setEmail(email);
		employee.setSalary(salary);
		employee.setDeptNum(deptno);
		employeeService.insertEmployee(employee);
		System.out.println("Insert Successful");
		return new ModelAndView("welcome", "message", "<html><body><center>welcome to spring</center></body></html>");
	}
	public ModelAndView welcome1(HttpServletRequest request, HttpServletResponse response) {
		String name=request.getParameter("name");
		String str="select * from "
		
				return new ModelAndView("welcome", "message", "<html><body><center>welcome to spring</center></body></html>");
	}
}
