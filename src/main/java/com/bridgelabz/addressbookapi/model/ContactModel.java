package com.bridgelabz.addressbookapi.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Table(name="contact")
@Data
public class ContactModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	private String firstname;
	private String lastname;
	private String mobilenumber;
	private LocalDateTime registeredDate=LocalDateTime.now();
	private LocalDateTime updatedDate;
	private String emailid;
//	private String address;
	private String city;
	private String pinCode;
	
	@ElementCollection
	@CollectionTable(name = "UserAddress", joinColumns = @JoinColumn(name = "user_id"))
	
	@Column(name = "address")
	private List<String> address;

	public ContactModel()
	{
		
	}

	public ContactModel(Long id, String firstname, String lastname, String mobilenumber, LocalDateTime registeredDate,
			LocalDateTime updatedDate, String emailid, String city, String pinCode) {
		super();
		Id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.registeredDate = registeredDate;
		this.updatedDate = updatedDate;
		this.emailid = emailid;
		this.city = city;
		this.pinCode = pinCode;
	}
	
}
