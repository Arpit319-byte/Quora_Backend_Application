package com.example.Quora_Backend_Application.repository;

import com.example.Quora_Backend_Application.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer,Long> {
}
