package com.bridgelabz.addressbookapi.dto;



import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class ContactDTO 
{
	@Pattern(regexp =  "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Invalid name")
	private String firstname;
	
	@NotBlank(message = "lastname should not be empty")
	private String lastname;
	
	@NotEmpty(message = "Mobile number cannot be null")
	private String mobilenumber;
	
	@NotEmpty(message = "Email Id cannot be null")
	private String emailid;
	
	@NotEmpty(message = "Address cannot be null")	
	private List<String> address;
	
	@NotEmpty(message = "City cannot be null")	
	private String city;
	
	@NotEmpty(message = "PinCode cannot be null")	
	private String pinCode;
}
