package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Message
 *
 */
@Entity

public class Message implements Serializable {

	   
	@Id
	private int idMessage;
	private int idSender;
	private int idReceiver;
	private String subject;
	private String file;
	private String test;
	private static final long serialVersionUID = 1L;

	public Message() {
		super();
	}   
	public int getIdMessage() {
		return this.idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}   
	public int getIdSender() {
		return this.idSender;
	}

	public void setIdSender(int idSender) {
		this.idSender = idSender;
	}   
	public int getIdReceiver() {
		return this.idReceiver;
	}

	public void setIdReceiver(int idReceiver) {
		this.idReceiver = idReceiver;
	}   
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}   
	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}   
	public String getTest() {
		return this.test;
	}

	public void setTest(String test) {
		this.test = test;
	}
   
}
