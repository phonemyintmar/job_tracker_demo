package com.pm.jobtracker.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Entity
@Table(name = "job")
@Getter
@Setter
public class Job {

    @Id
    private String jobId;

    private String job_description;

    private ZonedDateTime createdAt;
}
