package com.persistent.semicolon.userservice.model;


public class UseCase 
{
	
    private Long useCaseId;
	
	private String usecaseTitle;
	
	private String usecaseDescription;
	
//	private String createdDate;
	
	//private Date updatedDate;

	public UseCase() {
		super();
	}

	public UseCase(Long useCaseId, String usecaseTitle, String usecaseDescription) {
		super();
		this.useCaseId = useCaseId;
		this.usecaseTitle = usecaseTitle;
		this.usecaseDescription = usecaseDescription;
		
	//	this.createdDate = createdDate;
		//this.updatedDate = updatedDate;
	}

	public Long getUseCaseId() {
		return useCaseId;
	}

	public void setUseCaseId(Long useCaseId) {
		this.useCaseId = useCaseId;
	}

	public String getUsecaseTitle() {
		return usecaseTitle;
	}

	@Override
	public String toString() {
		return "UseCase [useCaseId=" + useCaseId + ", usecaseTitle=" + usecaseTitle + ", usecaseDescription="
				+ usecaseDescription + "]";
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
	



}   