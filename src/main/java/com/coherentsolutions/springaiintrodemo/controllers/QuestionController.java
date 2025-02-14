package com.coherentsolutions.springaiintrodemo.controllers;

import com.coherentsolutions.springaiintrodemo.model.Answer;
import com.coherentsolutions.springaiintrodemo.model.Question;
import com.coherentsolutions.springaiintrodemo.services.OpenAIService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionController {
    private final OpenAIService openAIService;

    public QuestionController(OpenAIService openAIService) {
        this.openAIService = openAIService;
    }

    @PostMapping("/ask")
    public Answer askQuestion(@RequestBody Question question) {
        return openAIService.getAnswer(question);
    }
}
