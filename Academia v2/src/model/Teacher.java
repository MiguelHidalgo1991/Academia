package model;

import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
public class Teacher extends Person {

	private BigDecimal salary;

	public Teacher(int id, String dni, String name, String surnames, Date bornDate) {
		super(id, dni, name, surnames, bornDate);
	}

	public Teacher(int id, String dni, String name, String surnames, Date bornDate, BigDecimal salary) {
		super(id, dni, name, surnames, bornDate);
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = new BigDecimal(salary);
		this.salary.setScale(2, BigDecimal.ROUND_CEILING);
	}
}
