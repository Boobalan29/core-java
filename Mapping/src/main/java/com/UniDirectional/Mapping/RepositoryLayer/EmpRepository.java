package com.UniDirectional.Mapping.RepositoryLayer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UniDirectional.Mapping.Entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer>{

}
