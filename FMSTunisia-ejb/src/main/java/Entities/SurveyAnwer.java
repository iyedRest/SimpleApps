package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyAnwer
 *
 */
@Entity

public class SurveyAnwer implements Serializable {

	   
	@Id
	private int idAnswer;
	private int idQuestion;
	private int idSurvey;
	private String answerText;
	private static final long serialVersionUID = 1L;

	public SurveyAnwer() {
		super();
	}   
	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
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
	public String getAnswerText() {
		return this.answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
   
}
