package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Complaint
 *
 */
@Entity

public class Complaint implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idComplaint;
	private int idUser;
	private String text;
	private String etat;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Complaint() {
		super();
	}   
	public int getIdComplaint() {
		return this.idComplaint;
	}

	public void setIdComplaint(int idComplaint) {
		this.idComplaint = idComplaint;
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
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
   
}
