package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Survey
 *
 */
@Entity

public class Survey implements Serializable {

	   
	@Id
	private int idSurvey;
	private String surveySubject;
	private int questionNumber;
	private static final long serialVersionUID = 1L;

	public Survey() {
		super();
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public String getSurveySubject() {
		return this.surveySubject;
	}

	public void setSurveySubject(String surveySubject) {
		this.surveySubject = surveySubject;
	}   
	public int getQuestionNumber() {
		return this.questionNumber;
	}

	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
   
}
