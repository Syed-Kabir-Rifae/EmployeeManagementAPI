package com.ibm.PracticeEmployeeRepo;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ibm.PracticeEmployeeModel.Employee;

import com.ibm.PracticeEmployeeModel.*;
//@Repository
//@EntityScan

//@EnableJpaRepositories("com.example.repositories")
@Repository
public interface EmploRepo extends JpaRepository<Employee, Long> {

//    public static final EmploRepo emp = null;
//	public void DeleteEmployeeById(Long id);
//	Optional<Employee> FindById(Long id);
	
}
