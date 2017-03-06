package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyQuestions
 *
 */
@Entity

public class SurveyQuestions implements Serializable {

	   
	@Id
	private int idQuestion;
	private int idSurvey;
	private String questionText;
	private int answersNumber;
	private static final long serialVersionUID = 1L;

	public SurveyQuestions() {
		super();
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public String getQuestionText() {
		return this.questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}   
	public int getAnswersNumber() {
		return this.answersNumber;
	}

	public void setAnswersNumber(int answersNumber) {
		this.answersNumber = answersNumber;
	}
   
}
