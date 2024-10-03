package com.HealthInsurance.HealthInsurance.ServiceLayer;

import com.HealthInsurance.HealthInsurance.BajajHealthInsurance.Policy;
import com.HealthInsurance.HealthInsurance.PolicyRepository.PolicyRepository;
import jakarta.persistence.EntityNotFoundException;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolicyService {
@Autowired
    PolicyRepository policyRepository;
 public Policy addpolicydetails(Policy newpolicy) {

        try {
         return policyRepository.save(newpolicy);


     } catch (ConstraintViolationException e) {
         throw new ConstraintViolationException("Details not entered", null, "policy");
     }


 }
 public List<Policy> getallpolicyDetails ()
    {

        return policyRepository.findAll();
    }
    public Policy getPolicyById(int id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Policy is not threre"));
    }

    public Policy updatePolicy(int id, Policy updatedPolicy) {
        Policy existingPolicy = policyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Policy not found"));

        existingPolicy.setPolicynumber(updatedPolicy.getPolicynumber());
        existingPolicy.setPolicyholderName(updatedPolicy.getPolicyholderName());
        existingPolicy.setCoverageamount(updatedPolicy.getCoverageamount());
        existingPolicy.setStartdate(updatedPolicy.getStartdate());

        return policyRepository.save(existingPolicy);
    }

    public void deletePolicy(int id) {
        if (!policyRepository.existsById(id)) {
            throw new EntityNotFoundException("Policy not found");
        }
        policyRepository.deleteById(id);
    }
}
