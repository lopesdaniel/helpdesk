package com.danieldev.api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Email(message = "Por Favor preencha com um email válido...")
	@NotEmpty(message = "O campo não pode estar vazio...")
	private String email;
	
	@Column
	@NotEmpty(message = "O campo não pode estar vazio...")
	private String name;
	
	@Column
	@NotEmpty(message = "O campo não pode estar vazio...")
	private String lastName;
	
	@Column
	@NotEmpty(message = "O campo não pode estar vazio...")
	private String password;
	
	@Column
	@NotEmpty(message = "O campo não pode estar vazio...")
	@Length(min = 5, message = "A senha não pode ter menos de 5 caracteres")
	private Boolean active;
	

	public User(Long id, String email, String name, String lastName, String password, Boolean active) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.active = active;
	}

	public User(String email, String name, String lastName, String password, Boolean active) {
		this.email = email;
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.active = active;
	}

	public User() {
		super();
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	
	
	
}
