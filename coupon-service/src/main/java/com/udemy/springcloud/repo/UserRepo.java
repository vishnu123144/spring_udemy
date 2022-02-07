package com.udemy.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.springcloud.model.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
