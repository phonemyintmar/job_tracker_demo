package com.pm.jobtracker.database.repo;

import com.pm.jobtracker.database.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, String> {
}
