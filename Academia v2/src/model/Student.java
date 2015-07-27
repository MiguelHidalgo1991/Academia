package model;

import java.util.Date;

@SuppressWarnings("serial")
public class Student extends Person {

	private String comments;

	public Student(int id, String name, String surnames, String dni, Date bornDate) {
		super(id, name, surnames, dni, bornDate);
	}

	public Student(int id, String name, String surnames, String dni, Date bornDate, String comments) {
		super(id, name, surnames, dni, bornDate);
		this.comments = comments;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
