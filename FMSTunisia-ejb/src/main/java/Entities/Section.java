package Entities;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Section
 *
 */
@Entity

public class Section implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSection;
	private String sectionName;
	private String description;
	private static final long serialVersionUID = 1L;

	public Section() {
		super();
	}   
	public int getIdSection() {
		return this.idSection;
	}

	public void setIdSection(int idSection) {
		this.idSection = idSection;
	}   
	public String getSectionName() {
		return this.sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
