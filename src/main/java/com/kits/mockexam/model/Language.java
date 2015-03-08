package com.kits.mockexam.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="LANGUAGE")
public class Language {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer langId;
	private String languageName;
	
	@OneToMany
	private Set<Question> questionList = new HashSet<>();
	
	
	
	
}
