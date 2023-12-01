package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter setter created
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="userregister")
public class User {
	
	private String name;
	@Id
	private String username;
	private String email;
	private String phone;
	private String password;
	private String cPassword;
	private String gender;
	
	
//	public User(String name, String username, String email, String phone, String password, String cPassword,
//			String gender) {
//		super();
//		this.name = name;
//		this.username = username;
//		this.email = email;
//		this.phone = phone;
//		this.password = password;
//		this.cPassword = cPassword;
//		this.gender = gender;
//		
//		
//	}
	
	

}
