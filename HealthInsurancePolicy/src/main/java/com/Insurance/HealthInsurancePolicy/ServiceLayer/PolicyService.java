package com.Insurance.HealthInsurancePolicy.ServiceLayer;

import com.Insurance.HealthInsurancePolicy.Entity.Policy;
import com.Insurance.HealthInsurancePolicy.RepositoryLayer.PolicyRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

   public Policy addpolicy(Policy newpolicy)
    {
        try{
           return policyRepository.save(newpolicy);
        }
       catch(ConstraintViolationException ex)
       {
           throw new RuntimeException("Failed to add policy due to constraint violation.", ex);
       }
    }

   public List<Policy> getallpolicy()
    {
        return policyRepository.findAll();
    }
}
