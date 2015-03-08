package com.kits.mockexam.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kits.mockexam.dao.QuestionDAO;
import com.kits.mockexam.model.Question;

@Path("/service/")
public class QuestionSvcImpl implements QuestionSvc {

	private static final Logger LOGGER = Logger.getLogger(QuestionSvcImpl.class);

	@Autowired
	QuestionDAO questionDAO;


	@Override
	@GET
	@Path(value = "{questionId}")
	@Produces(MediaType.APPLICATION_XML)
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public  Question getQuestionById(@PathParam("questionId") int questionId) {
		LOGGER.debug("questionId to be searched: " + questionId);
		System.out.println("inside ::");
		Question question = questionDAO.getQuestionById(questionId);
		return question;
	}

	@Override
	public Boolean addQuestion(Question question) {
		Boolean isQuestionAdded = false;
		
		questionDAO.addQuestion(question);
		return isQuestionAdded;
	}

	@Override
	public List<Question> getQuestions(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

	public QuestionDAO getQuestionDAO() {
		return questionDAO;
	}

	public void setQuestionDAO(QuestionDAO questionDAO) {
		this.questionDAO = questionDAO;
	}
	
	

}
