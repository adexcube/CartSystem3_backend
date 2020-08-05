package edu.miu.eshop.admin.domain;

import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Requirement {

	private Integer requestId;
	private String subject;
	private LocalDate startDate;
	private LocalDate dueDate;
	private LocalDate endDate;
	private Status status;
	private String description;
	private int assignTo;
	private LocalDate registeredDate;
	
	
	public Requirement(Integer requestId, String subject, LocalDate startDate, LocalDate dueDate, LocalDate endDate, Status status, String description, 
			int assignTo, LocalDate registeredDate) {
		this.requestId = requestId;
		this.subject = subject;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.status = status;
		this.description = description;
		this.assignTo = assignTo;
		this.registeredDate = registeredDate;
		
		
	}
	
	
	public Requirement() {
		// TODO Auto-generated constructor stub
	}


	public Integer getRequestId() {
		return requestId;
	}


	public void setRequestId(Integer requestId) {
		this.requestId = requestId;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getAssignTo() {
		return assignTo;
	}


	public void setAssignTo(int assignTo) {
		this.assignTo = assignTo;
	}


	public LocalDate getRegisteredDate() {
		return registeredDate;
	}


	public void setRegisteredDate(LocalDate registeredDate) {
		this.registeredDate = registeredDate;
	}
	
	
	
	
}
