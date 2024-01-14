package com.pm.jobtracker.database.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user") //naming convention = small singular with _ for spaces, eg. student, student_course
@Getter
@Setter
public class User {

    @Id
    private String userId;

    private String userName;

    private String email;
}
