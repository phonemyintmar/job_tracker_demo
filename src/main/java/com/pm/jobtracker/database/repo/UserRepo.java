package com.pm.jobtracker.database.repo;

import com.pm.jobtracker.database.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
