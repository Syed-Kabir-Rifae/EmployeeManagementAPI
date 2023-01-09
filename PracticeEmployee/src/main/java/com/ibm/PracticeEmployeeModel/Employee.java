package com.ibm.PracticeEmployeeModel;

//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
////import org.hibernate.annotations.Entity;
//
//@EntityScan
//@EnableJpaRepositories
//public class Employee implements Serializable
// {
//	
//	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
//	private String name;
//	private Long id;
//	private String designation;
//	private String location;
//	private String phoneNo;
//	private String uRL;
//	
//	 public Employee() {}
//	
//public Employee(String name, long id, String designation, String location, String phoneNo, String uRL) {
//		super();
//		this.name = name;
//		this.id = id;
//		this.designation = designation;
//		this.location = location;
//		this.phoneNo = phoneNo;
//		this.uRL = uRL;
//	}
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getDesignation() {
//		return designation;
//	}
//
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	public String getPhoneNo() {
//		return phoneNo;
//	}
//
//	public void setPhoneNo(String phoneNo) {
//		this.phoneNo = phoneNo;
//	}
//
//	public String getuRL() {
//		return uRL;
//	}
//
//	public void setuRL(String uRL) {
//		this.uRL = uRL;
//	}
//
//	public void setEmployee(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	 @Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "Employee{" +
//				"id=" +id +
//				", name='" + name +'\'' +
//				", designation='" + designation +'\'' +
//				", location='" + location +'\'' +
//				", phoneNo='" + phoneNo +'\'' +
//				", url='" + uRL +'\'' +
//				'}';
//	}
//	
//
//}
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name=  "EmployeesTable")
public class Employee implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="jobTitle")
    
    private String jobTitle;
    @Column(name="phone")
    private String phone;


    public Employee() {}

    public Employee(String name, String email, String jobTitle, String phone) {
    
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

   
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                 +
                '}';
    }
}