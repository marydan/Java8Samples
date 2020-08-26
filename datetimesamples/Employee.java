package datetimesamples;

import java.time.LocalDate;

public class Employee {

	String name;
	LocalDate dateofbirth;
	LocalDate dateofjoin;
	int salary;
	
	Employee(String n,LocalDate dob,LocalDate doj,int s)
	{
		name=n;
		dateofbirth=dob;
		dateofjoin=doj;
		salary=s;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public LocalDate getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(LocalDate dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString()
	{
		return "Name " + name + " Date of Birth " + dateofbirth + " Join date" + dateofjoin;
	}
}
