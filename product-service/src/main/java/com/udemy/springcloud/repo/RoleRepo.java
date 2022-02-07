package com.udemy.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.springcloud.model.Role;

public interface RoleRepo extends JpaRepository<Role, Long> {

}
