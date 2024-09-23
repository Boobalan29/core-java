package com.UniDirectional.Mapping.OneToneMappingTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.UniDirectional.Mapping.Entity.Employee;
import com.UniDirectional.Mapping.Entity.PersonalDetails;
import com.UniDirectional.Mapping.RepositoryLayer.EmpRepository;

@SpringBootTest
public class EmployeeTest {
	@Autowired
	private EmpRepository Emprepo;
	
	@Test
	public void employeeTest()
	{
		Employee emp =new Employee();
		emp.setEmpid(1);
		emp.setEmpname("Boobalan");
		emp.setDept("Software Developer");
		emp.setDeptno(10);
	
		
		PersonalDetails Pd=new PersonalDetails();
		 Pd.setId(1);
		 Pd.setAadharno(5311);
		 
		 
		 emp.setAadhardetails(Pd);
		 Emprepo.save(emp);
		 
	}

}

