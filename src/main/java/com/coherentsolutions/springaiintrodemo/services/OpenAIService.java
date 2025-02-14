package com.coherentsolutions.springaiintrodemo.services;

import com.coherentsolutions.springaiintrodemo.model.Answer;
import com.coherentsolutions.springaiintrodemo.model.Question;

public interface OpenAIService {
    String getAnswer(String question);
    Answer getAnswer(Question question);
}
