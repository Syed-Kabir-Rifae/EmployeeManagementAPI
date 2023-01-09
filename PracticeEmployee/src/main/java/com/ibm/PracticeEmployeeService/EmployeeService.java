package com.ibm.PracticeEmployeeService;

//import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.ibm.PracticeEmployeeException.UserNotFoundException;
import com.ibm.PracticeEmployeeModel.Employee;
import com.ibm.PracticeEmployeeRepo.EmploRepo;


//@Service
//@EntityScan("com.example.entities")
//@EnableJpaRepositories("com.example.repositories")
//@Service
//@Transactional

//@EnableJpaRepositories("com.ibm.PracticeEmployeeRepo")
//@Service
//@Transactional
//public class EmployeeService {
//	
//	private final EmploRepo emplorepo;
//	@Autowired
//	public EmployeeService(EmploRepo emplorepo) {
//		
//		this.emplorepo = emplorepo;
//	}
//
//    public Employee addEmployee(Employee emp) {
//		emp.setEmployee(UUID.randomUUID().toString());
//		return emplorepo.save(emp);
//}
//	public Employee updateEmployee(Employee emp) {
//		return emplorepo.save(emp);
//	}
//	public List<Employee> findAllEmployee(){
//		return emplorepo.findAll();
//	}
//	public Employee FindEmployeeByid(Long id) {
//		return emplorepo.FindById(id).orElseThrow(() -> new UserNotFoundException("User not found"));
//		
//	}
//	public void DeleteEmployee(Long id) {
//		emplorepo.DeleteEmployeeById(id);
//	}
//	
//}


import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

public class EmployeeService {
    private final EmploRepo employeeRepo;

    @Autowired
    public EmployeeService(EmploRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
//
//    public Employee addEmployee(Employee employee) {
//        employee.setEmployeeCode(UUID.randomUUID().toString());
//        return employeeRepo.save(employee);
//    }

    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

//    public Employee findEmployeeById(Long id) {
//        return employeeRepo.FindById(id)
//                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
//    }

//    public void deleteEmployee(Long id){
//        employeeRepo.DeleteEmployeeById(id);
//    }
}