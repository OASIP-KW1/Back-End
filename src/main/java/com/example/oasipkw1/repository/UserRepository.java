package com.example.oasipkw1.repository;

import com.example.oasipkw1.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
}
