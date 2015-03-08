package com.kits.mockexam.services;

import java.util.List;

import com.kits.mockexam.model.Question;

public interface QuestionSvc {

	Question getQuestionById(int QuestionId);
	Boolean addQuestion(Question Question);
	List<Question> getQuestions(Question Question);
}
