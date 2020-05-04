package com.kavi.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class Customer {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@JsonProperty("id")
	private int customerid;
	@JsonProperty("fname")
	private String customerfname;
	@JsonProperty("lname")
	private String customerlname;
	@JsonProperty("mail")
	private String customermail;
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerfname() {
		return customerfname;
	}
	public void setCustomerfname(String customerfname) {
		this.customerfname = customerfname;
	}
	public String getCustomerlname() {
		return customerlname;
	}
	public void setCustomerlname(String customerlname) {
		this.customerlname = customerlname;
	}
	public String getCustomermail() {
		return customermail;
	}
	public void setCustomermail(String customermail) {
		this.customermail = customermail;
	}

	

}
