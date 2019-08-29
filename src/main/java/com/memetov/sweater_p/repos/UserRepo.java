package com.memetov.sweater_p.repos;

import com.memetov.sweater_p.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
