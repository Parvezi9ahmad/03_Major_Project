package in.ashokit.entity;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	
	private String name;
	private Date dob;
	private String gender;
	private String ssn;
	private String stateName;
	
}
