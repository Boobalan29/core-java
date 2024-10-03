package com.Insurance.HealthInsurancePolicy.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;


@Entity
@Table(name="Policy")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotBlank(message = "Write Policy Number")
    private String policynumber;
    @NotBlank(message="Write poliy Holder Name")
    private String policyholder;
@Positive(message="coverage must bepositive")
    private long coverageamount;
@NotNull(message = "Enter start date")
private LocalDate startdate;

    public Policy() {
    }

    public Policy(int id, String policynumber, String policyholder, long coverageamount, LocalDate startdate) {
        this.id = id;
        this.policynumber = policynumber;
        this.policyholder = policyholder;
        this.coverageamount = coverageamount;
        this.startdate = startdate;
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

    public String getPolicyholder() {
        return policyholder;
    }

    public void setPolicyholder(String policyholder) {
        this.policyholder = policyholder;
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
