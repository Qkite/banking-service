package com.numble.challenge.bankingservice;

import com.numble.challenge.bankingservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
