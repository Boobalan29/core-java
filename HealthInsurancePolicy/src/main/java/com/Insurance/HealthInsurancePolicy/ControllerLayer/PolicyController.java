package com.Insurance.HealthInsurancePolicy.ControllerLayer;

import com.Insurance.HealthInsurancePolicy.Entity.Policy;
import com.Insurance.HealthInsurancePolicy.ServiceLayer.PolicyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @PostMapping("/add")
   public ResponseEntity<Policy> Createdpolicy(@Valid @RequestBody Policy newpolicy)
    {

        Policy Createdpolicy=policyService.addpolicy(newpolicy);
        return new ResponseEntity<>(Createdpolicy,HttpStatus.CREATED);
    }

    @GetMapping("/all")
    ResponseEntity<List<Policy>> getallpolicy()
    {
        List <Policy> Policies=policyService.getallpolicy();
        if(Policies.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
        return new ResponseEntity<>(Policies,HttpStatus.OK);
    }
}
