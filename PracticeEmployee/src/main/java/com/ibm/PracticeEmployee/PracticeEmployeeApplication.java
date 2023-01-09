package com.ibm.PracticeEmployee;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.PracticeEmployeeModel.Employee;
import com.ibm.PracticeEmployeeRepo.EmploRepo;
import com.ibm.PracticeEmployeeService.EmployeeService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@SpringBootApplication(scanBasePackages = {"com.ibm.PracticeEmployeeException","com.ibm.EmployeeController","com.ibm.PracticeEmployeeService","com.ibm.PracticeEmployeeModel", "com.ibm.PracticeEmployeeRepo"})
//@ComponentScan({"com.ibm.EmployeeController", "EmployeeController1","com.ibm.PracticeEmployeeService","EmployeeService","com.ibm.PracticeEmployeeRepo","EmploRepo"})
//@EnableJpaRepositories("com.ibm.PracticeEmployeeRepo")
@SpringBootApplication
@EntityScan(basePackages = {"com.ibm.PracticeEmployeeModel","com.ibm.PracticeEmployeeRepo"})
@EnableJpaRepositories("com.ibm.PracticeEmployeeRepo")

public class PracticeEmployeeApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PracticeEmployeeApplication.class, args);
	}
	
	
	@RestController
	public class EmployeeController{
		@Autowired
		private EmploRepo employeeRepo;
		@CrossOrigin("http://localhost:4200")
		@GetMapping(value="/employees")
		public List<Employee> getAllEmployee(){
			return employeeRepo.findAll();
		}
	  @GetMapping("/qddq")
	  public String as() {
		  return "asds";
	  }
	  @CrossOrigin("http://localhost:4200")
	  @RequestMapping(value ="/employees/employee", method= RequestMethod.POST, consumes="application/json")
	  public Employee AddEmployee(@RequestBody Employee employee)
	  {
		  return employeeRepo.save(employee);
	  }
	  
	  @GetMapping(value="Profile" ,produces = MediaType.TEXT_PLAIN_VALUE)
		public String RetrunName() {
			return "HEY BRO";
	  }}

	}

