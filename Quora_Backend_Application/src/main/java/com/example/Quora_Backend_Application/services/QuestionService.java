package com.example.Quora_Backend_Application.services;

import com.example.Quora_Backend_Application.models.Question;
import com.example.Quora_Backend_Application.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public boolean createQuestion(Question question){
        questionRepository.save(question);
        return true;
    }




}
