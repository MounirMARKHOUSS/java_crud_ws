package com.inti.formation.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class User {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique =true)
	private String email;
 	private String password;
//	@Transient
//    private String passwordConfirm;
//	
//	private String role;
//
//	
//	
 	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long id, String email, String password, String passwordConfirm, String role) {
		super();
		this.id = id;
		this.email = email;
//		this.password = password;
//		this.passwordConfirm = passwordConfirm;
//		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
//
//	public String getPasswordConfirm() {
//		return passwordConfirm;
//	}
//
//	public void setPasswordConfirm(String passwordConfirm) {
//		this.passwordConfirm = passwordConfirm;
//	}
//
//	public String getRole() {
//		return role;
//	}
//
//	public void setRole(String role) {
//		this.role = role;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
	}

	 
	
	
}
