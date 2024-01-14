package com.pm.jobtracker.database.repo;

import com.pm.jobtracker.database.model.JobUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobUserRepo extends JpaRepository<JobUser, String> {
}
