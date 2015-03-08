package com.kits.mockexam.dao;

import java.util.List;

import com.kits.mockexam.model.Question;

public interface QuestionDAO {

	Question getQuestionById(int QuestionId);

	void addQuestion(Question Question);

	List<Question> getQuestions(Question Question);
}
