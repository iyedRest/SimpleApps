package Entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Visit
 *
 */
@Entity

public class Visit implements Serializable {

	   
	@Id
	private int idVisit;
	private int idUser;
	private Date date;
	private int idForum;
	private int idSection;
	private static final long serialVersionUID = 1L;

	public Visit() {
		super();
	}   
	public int getIdVisit() {
		return this.idVisit;
	}

	public void setIdVisit(int idVisit) {
		this.idVisit = idVisit;
	}   
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}   
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}   
	public int getIdForum() {
		return this.idForum;
	}

	public void setIdForum(int idForum) {
		this.idForum = idForum;
	}   
	public int getIdSection() {
		return this.idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}
   
}
