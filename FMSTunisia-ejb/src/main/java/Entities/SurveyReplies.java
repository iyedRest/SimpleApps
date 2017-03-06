package Entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SurveyReplies
 *
 */
@Entity

public class SurveyReplies implements Serializable {

	   
	@Id
	private int idReply;
	private int idSurvey;
	private int idUser;
	private int idQuestion;
	private int idAnswer;
	private static final long serialVersionUID = 1L;

	public SurveyReplies() {
		super();
	}   
	public int getIdReply() {
		return this.idReply;
	}

	public void setIdReply(int idReply) {
		this.idReply = idReply;
	}   
	public int getIdSurvey() {
		return this.idSurvey;
	}

	public void setIdSurvey(int idSurvey) {
		this.idSurvey = idSurvey;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}   
	public int getIdAnswer() {
		return this.idAnswer;
	}

	public void setIdAnswer(int idAnswer) {
		this.idAnswer = idAnswer;
	}
   
}
