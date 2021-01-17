package com.stackMyBiz.registeration.model;

import javax.validation.constraints.Pattern;

public class UserDao {
	    
	    private String userName;
	    
	    private String Name;
	   
	    @Pattern(regexp="[a-zA-Z0-9]{6}", message="password should be alpha-numeric of size 6")
	    private String password;
	    
	    @Pattern(regexp="[7-9][0-9]{9}", message="please provide valid contact no")
	    private String contact; 
	    
	    @Pattern(regexp="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", message="please provide valid mail id")
	    private String mailId;
	    
	    private String dob;
	    
	    private String address;

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getMailId() {
			return mailId;
		}

		public void setMailId(String mailId) {
			this.mailId = mailId;
		}

		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
	    

}
