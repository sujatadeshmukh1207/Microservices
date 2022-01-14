package com.persistent.semicolon.UseCase_Service2.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UseCase")
public class UseCase 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long useCaseId;
	
	@Column(unique = true)
	private String usecaseTitle;
	
	@Column(columnDefinition = "LONGTEXT")
	private String usecaseDescription;
	

	//@Basic
	//@Temporal(TemporalType.TIMESTAMP)
	
	//private String createdDate;
	

	/*
	 * @Temporal(TemporalType.TIMESTAMP) private Date updatedDate;
	 */

	public UseCase() {
  super();
	}

	public UseCase(long useCaseId, String usecaseTitle, String usecaseDescription) {
		super();
		this.useCaseId = useCaseId;
		this.usecaseTitle = usecaseTitle;
		this.usecaseDescription = usecaseDescription;
		//this.createdDate = createdDate;
		//this.updatedDate = updatedDate;
	}

	public long getUseCaseId() {
		return useCaseId;
	}

	public void setUseCaseId(long useCaseId) {
		this.useCaseId = useCaseId;
	}

	public String getUsecaseTitle() {
		return usecaseTitle;
	}

	public void setUsecaseTitle(String usecaseTitle) {
		this.usecaseTitle = usecaseTitle;
	}

	public String getUsecaseDescription() {
		return usecaseDescription;
	}

	public void setUsecaseDescription(String usecaseDescription) {
		this.usecaseDescription = usecaseDescription;
	}

	/*
	 * public String getCreatedDate() { return createdDate; }
	 * 
	 * public void setCreatedDate(String createdDate) { this.createdDate =
	 * createdDate; }
	 */
	@Override
	public String toString() {
		return "UseCase [useCaseId=" + useCaseId + ", usecaseTitle=" + usecaseTitle + ", usecaseDescription="
				+ usecaseDescription +"]";
	}

	/*
	 * public Date getUpdatedDate() { return updatedDate; }
	 * 
	 * public void setUpdatedDate(Date updatedDate) { this.updatedDate =
	 * updatedDate; }
	 */

    
	




}   