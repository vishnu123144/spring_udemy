package com.udemy.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.springcloud.model.User;

public interface UserRepo extends JpaRepository<User, Long>{
     User findByEmail(String email);
}
