package com.udemy.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.springcloud.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
