package model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Person implements Serializable {
	private int id;
	private String name, surnames, dni;
	private Date bornDate;

	public Person(int id, String name, String surnames, String dni, Date bornDate) {
		super();
		this.id = id;
		this.name = name;
		this.surnames = surnames;
		this.dni = dni;
		this.bornDate = bornDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getBornDate() {
		return bornDate;
	}

	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}
}
