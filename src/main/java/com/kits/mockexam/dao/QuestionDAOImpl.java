package com.kits.mockexam.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.kits.mockexam.model.Question;

public class QuestionDAOImpl implements QuestionDAO {

	@Autowired
	private ICommonDao dao;

	private static final Logger LOGGER = Logger
			.getLogger(QuestionDAOImpl.class);

	public QuestionDAOImpl() {
		System.out.println("inside questionDAoImpl");
	}

	@Override
	public Question getQuestionById(int questionId) {
		LOGGER.debug("fetching questionId: " + questionId);
		// Question question = (Question)
		// getSessionFactory().getCurrentSession()
		// .get(Question.class, questionId);
		// Question question = (Question)
		// getHibernateTemplate().get(Question.class, questionId);
		Question question = dao.getEntity(Question.class, questionId);

		return question;
	}

	public ICommonDao getDao() {
		return dao;
	}

	public void setDao(ICommonDao dao) {
		this.dao = dao;
	}

	@Override
	public void addQuestion(Question question) {
		LOGGER.debug("question to be added: " + question);
		dao.save(question);
		
	}

	@Override
	public List<Question> getQuestions(Question question) {
		// TODO Auto-generated method stub
		return null;
	}

}
