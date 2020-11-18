package com.tcs.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
