package com.kits.mockexam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.kits.mockexam.dao.IEntity;

@XmlRootElement
@Entity
@Table(name="QUESTIONS")
public class Question implements IEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="QUESTION_ID", length=8, nullable=false)
	private Integer questionId;
	
	@Column(name="QUESTION", length=512, nullable=false)
	private String question;
	
	@Column(name="OPTION1", length=512, nullable=false)
	private String option1;
	
	@Column(name="OPTION2", length=512, nullable=false)
	private String option2;
	
	@Column(name="OPTION3", length=512, nullable=false)
	private String option3;
	
	@Column(name="OPTION4", length=512, nullable=false)
	private String option4;
	
	@Column(name="ANSWER", length=512, nullable=false)
	private String answer;
	
	@Column(name="IS_ENABLED", nullable=false)
	@org.hibernate.annotations.Type(type = "yes_no")
	private Boolean isEnabled;

	public Boolean getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question
				+ ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", answer="
				+ answer + "]";
	}

}
