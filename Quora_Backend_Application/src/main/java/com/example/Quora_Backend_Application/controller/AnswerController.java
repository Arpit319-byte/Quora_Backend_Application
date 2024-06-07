package com.example.Quora_Backend_Application.controller;

import com.example.Quora_Backend_Application.models.Answer;
import com.example.Quora_Backend_Application.services.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnswerController {

    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping("/answer/{questionId}")
    public ResponseEntity<List<Answer>> getAllAnswers(@PathVariable Long questionId){
      List<Answer> answers=answerService.getAllAnswers(questionId);
        return new ResponseEntity<>(answers, HttpStatus.OK);
    }


    @PostMapping("/question/{questionId}/answer")
    public ResponseEntity<Answer> createAnswer(@RequestBody Answer answer){
        Answer answer1 = answerService.createAnswer(answer);
        return new ResponseEntity<>(answer1, HttpStatus.CREATED);
    }

    @PutMapping("/answer/{answerId}")
    public ResponseEntity<Answer> updateAnswer(@PathVariable Long answerId, @RequestBody Answer answer){
        Answer answer1 = answerService.updateAnswer(answerId, answer);
        return new ResponseEntity<>(answer1, HttpStatus.OK);
    }

    @DeleteMapping("/answer/{answerId}")
    public ResponseEntity<String> deleteAnswer(@PathVariable Long answerId){
        Answer answer= answerService.deleteAnswerById(answerId);
        if(answer!=null)
            return new ResponseEntity<>("Answer Deleted Successfully", HttpStatus.OK);

        else
            return new ResponseEntity<>("Answer Not Found", HttpStatus.NOT_FOUND);
    }

}
