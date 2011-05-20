package com.perso.projectTest1.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="ETABLISSEMENT")
public class Etablissement  implements IModel{
	

	private static final long serialVersionUID = 1959266795481590542L;


	@Id
	private long id;
	
	
	private String name;
	
	private String address;
	@Column(name="POSTAL_CODE")
	private String postalCode;
	private String city;
	
	private String phone;
	private String fax;
	
	@Column(name="DATE_CREATION")
	private Date dateCreation;
	@Column(name="DATE_MODIFICATION")
	private Date dateModification;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	@Override
	public String toString() {
		return "Etablissement [id=" + id + ", name=" + name + ", address="
				+ address + ", postalCode=" + postalCode + ", city=" + city
				+ ", phone=" + phone 
				+ ", fax=" + fax + ", dateCreation=" + dateCreation
				+ ", dateModification=" + dateModification + "]";
	}
	
	


}
