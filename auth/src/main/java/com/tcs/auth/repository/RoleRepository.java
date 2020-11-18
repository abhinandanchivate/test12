package com.tcs.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
