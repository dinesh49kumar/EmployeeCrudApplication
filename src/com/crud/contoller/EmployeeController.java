package com.crud.contoller;

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
	public ModelAndView welcome() {
//		public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		Employee employee = new Employee();
		employee.setEmployeeName("Suraj");
		employee.setEmail("suraj123@gmail.com");
		employee.setSalary(40200);
		employee.setDeptNum(20);
		employeeService.insertEmployee(employee);
		
		return new ModelAndView("welcome", "message", "welcome to spring");
	}
}
