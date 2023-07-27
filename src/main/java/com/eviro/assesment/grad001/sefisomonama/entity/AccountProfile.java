package com.eviro.assesment.grad001.sefisomonama.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "account_profile")
public class AccountProfile {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "account_holder_name")
	private String accountHolderName;
	
	@Column(name = "account_holder_surname")
	private String accountHolderSurname;
    
	@Column(name = "http_Image_link")
	private String httpImageLink;

	
	public AccountProfile() {
		super();
	}
	public String getAcountHolderName() {
		return accountHolderName;
	}
	public void setAcountHolderName(String acountHolderName) {
		this.accountHolderName = acountHolderName;
	}
	public String getAccountHolderSurname() {
		return accountHolderSurname;
	}
	public void setAccountHolderSurname(String accountHolderSurname) {
		this.accountHolderSurname = accountHolderSurname;
	}
	public String getHttpImageLink() {
		return httpImageLink;
	}
	public void setHttpImageLink(String httpImageLink) {
		this.httpImageLink = httpImageLink;
	}
	
	
}
