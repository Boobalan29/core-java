package com.HealthInsurance.HealthInsurance.PolicyRepository;

import com.HealthInsurance.HealthInsurance.BajajHealthInsurance.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PolicyRepository extends JpaRepository<Policy,Integer> {
}
