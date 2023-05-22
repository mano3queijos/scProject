package br.com.javaweb.scProject.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Crewmate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// unique id, the id creation logic still needs to be done
	private Long id;
	private String name;
	private String email;
	private String password;
	private LocalDate birthdayDate;

	
	public Crewmate() {
	}

	// constructors

	public Crewmate(String name, String email, String password, LocalDate birthdayDate) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.birthdayDate = birthdayDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getBirthdayDate() {
		return birthdayDate;
	}

	public void setBirthdayDate(LocalDate birthdayDate) {
		this.birthdayDate = birthdayDate;
	}

}
