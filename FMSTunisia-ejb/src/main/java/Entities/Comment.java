package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity

public class Comment implements Serializable {

	   
	@Id
	private int idComment;
	private int idPost;
	private int idUser;
	private String text;
	private String file;
	private int numberOfLikes;
	private int numberOfDislikes;
	private static final long serialVersionUID = 1L;

	public Comment() {
		super();
	}   
	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}   
	public int getIdPost() {
		return this.idPost;
	}

	public void setIdPost(int idPost) {
		this.idPost = idPost;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}   
	public int getNumberOfLikes() {
		return this.numberOfLikes;
	}

	public void setNumberOfLikes(int numberOfLikes) {
		this.numberOfLikes = numberOfLikes;
	}   
	public int getNumberOfDislikes() {
		return this.numberOfDislikes;
	}

	public void setNumberOfDislikes(int numberOfDislikes) {
		this.numberOfDislikes = numberOfDislikes;
	}
   
}
