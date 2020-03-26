package com.jwat.model;

import java.sql.Date;

public class User {
	private int id;
	// private String username;
	private String email;
	private String password;
	// private String phone_number;
	// private String address;
	// private Date dob;
	// private String university;
	// private Boolean is_admin;
	// private int status;
	// private Date updated_at;
	private Date created_at;
	// private Date deactived_at;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// public String getUsername() {
	// 	return username;
	// }

	// public void setUsername(String username) {
	// 	this.username = username;
	// }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// public String getPhone_number() {
	// 	return phone_number;
	// }

	// public void setPhone_number(String phone_number) {
	// 	this.phone_number = phone_number;
	// }

	// public String getAddress() {
	// 	return address;
	// }

	// public void setAddress(String address) {
	// 	this.address = address;
	// }

	// public Date getDob() {
	// 	return dob;
	// }

	// public void setDob(Date dob) {
	// 	this.dob = dob;
	// }

	// public String getUniversity() {
	// 	return university;
	// }

	// public void setUniversity(String university) {
	// 	this.university = university;
	// }

	// public Boolean getIs_admin() {
	// 	return is_admin;
	// }

	// public void setIs_admin(Boolean is_admin) {
	// 	this.is_admin = is_admin;
	// }

	// public int getStatus() {
	// 	return status;
	// }

	// public void setStatus(int status) {
	// 	this.status = status;
	// }

	// public Date getUpdated_at() {
	// 	return updated_at;
	// }

	// public void setUpdated_at(Date updated_at) {
	// 	this.updated_at = updated_at;
	// }

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	// public Date getDeactived_at() {
	// 	return deactived_at;
	// }

	// public void setDeactived_at(Date deactived_at) {
	// 	this.deactived_at = deactived_at;
	// }

	public User(int id, String username, String email, String password, String phone_number, String address, Date dob,
			String university, Boolean is_admin, int status, Date updated_at, Date created_at, Date deactived_at) {
		super();
		this.id = id;
		// this.username = username;
		this.email = email;
		this.password = password;
		// this.phone_number = phone_number;
		// this.address = address;
		// this.dob = dob;
		// this.university = university;
		// this.is_admin = is_admin;
		// this.status = status;
		// this.updated_at = updated_at;
		this.created_at = created_at;
		// this.deactived_at = deactived_at;
	}

	public User() {

	}

}
