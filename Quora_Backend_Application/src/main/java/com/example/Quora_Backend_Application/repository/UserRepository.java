package com.example.Quora_Backend_Application.repository;

import com.example.Quora_Backend_Application.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {

}
