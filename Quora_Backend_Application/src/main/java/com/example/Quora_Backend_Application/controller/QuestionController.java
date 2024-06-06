package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.Question;
import com.example.Quora_Backend_Application.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController {



    QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @PostMapping
    public ResponseEntity<String> creteQuestion(@RequestBody Question question){

        if(questionService.createQuestion(question))
         return new ResponseEntity<>("Question Created Successfully", HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Question Not Created", HttpStatus.BAD_REQUEST);

    }
}
