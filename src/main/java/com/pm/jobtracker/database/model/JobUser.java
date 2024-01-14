package com.pm.jobtracker.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "job_user")
@Getter
@Setter
public class JobUser {

    //you should learn how to actually do the compound or whatever id here so that it works.
    @Id
    private String jobId;

    private String userId;

    private ZonedDateTime appliedDate;
}
