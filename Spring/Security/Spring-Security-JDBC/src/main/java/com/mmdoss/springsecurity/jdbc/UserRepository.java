package com.mmdoss.springsecurity.jdbc;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmdoss.springsecurity.jdbc.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUserName(String userName);

}
