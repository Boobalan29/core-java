package com.HealthInsurance.HealthInsurance.BajajHealthInsurance;


import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "policytable")

public class Policy {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
  private  int id;

    @Column
  private  String policynumber;
  private  String policyholderName;
  private  long coverageamount;

   private LocalDate startdate;

    public Policy(int id, String policynumber, String policyholderName, long coverageamount, LocalDate startdate) {
        this.id = id;
        this.policynumber = policynumber;
        this.policyholderName = policyholderName;
        this.coverageamount = coverageamount;
        this.startdate = startdate;
    }

    public Policy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPolicynumber() {
        return policynumber;
    }

    public void setPolicynumber(String policynumber) {
        this.policynumber = policynumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public void setPolicyholderName(String policyholderName) {
        this.policyholderName = policyholderName;
    }

    public long getCoverageamount() {
        return coverageamount;
    }

    public void setCoverageamount(long coverageamount) {
        this.coverageamount = coverageamount;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }
}
