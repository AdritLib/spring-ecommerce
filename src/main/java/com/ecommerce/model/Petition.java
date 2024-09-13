package com.ecommerce.model;

import java.util.Date;

public class Petition {
	private Integer id;
	private String number;
	private Date dateCreation;
	private Date dateDelivered;
	private double total;
	
	public Petition() {
	}
	
	public Petition(Integer id, String number, Date dateCreation, Date dateDeliveried, double total) {
		this.id = id;
		this.number = number;
		this.dateCreation = dateCreation;
		this.dateDelivered = dateDeliveried;
		this.total = total;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateDeliveried() {
		return dateDelivered;
	}
	public void setDateDeliveried(Date dateDeliveried) {
		this.dateDelivered = dateDeliveried;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Petition [id=" + id + ", number=" + number + ", dateCreation=" + dateCreation + ", dateDeliveried="
				+ dateDelivered + ", total=" + total + "]";
	}
}
