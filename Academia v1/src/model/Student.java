package model;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
	private int identificador;
	private String name, surname, dni, observation;
	private Date dateOfBirth;

	public Student(int identificador, String name, String surname, String dni, Date dateOfBirth, String observation) {
		super();
		this.identificador = identificador;
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.dateOfBirth = dateOfBirth;
		this.observation = observation;
	}

	public int getIdentificador() {
		return identificador;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

}
