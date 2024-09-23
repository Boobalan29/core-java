package com.HealthInsurance.HealthInsurance.ControllerLayer;

import com.HealthInsurance.HealthInsurance.BajajHealthInsurance.Policy;
import com.HealthInsurance.HealthInsurance.ServiceLayer.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    PolicyService policyservice;

    @PostMapping("/add")
    public ResponseEntity<Policy> addPolicy(@Validated @RequestBody Policy policy)
    {
        Policy createdpolicy= policyservice.addpolicydetails(policy);
        return new ResponseEntity<>(createdpolicy,HttpStatus.CREATED);

    }
    @GetMapping("/All")
    public List policydetails()
    {
         return policyservice.getallpolicyDetails();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Policy> getPolicyById(@PathVariable int id) {
        Policy policy = policyservice.getPolicyById(id);
        return new ResponseEntity<>(policy, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Policy> updatePolicy(@PathVariable int id, @Validated @RequestBody Policy policy) {
        Policy updatedPolicy = policyservice.updatePolicy(id, policy);
        return new ResponseEntity<>(updatedPolicy, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePolicy(@PathVariable int id) {
        policyservice.deletePolicy(id);
        return new ResponseEntity<>("Policy deleted successfully", HttpStatus.OK);
    }
}



