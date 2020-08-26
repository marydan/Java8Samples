package datetimesamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	
	String Name;
	String subject;
	int total;
	School school;
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	Student(String name,String sub,int tot,School s)
	{
		this.Name=name;
		this.subject=sub;
		this.total=tot;
		this.school=s;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

 class School {
	String name;
	String location;
	
	School(String name,String loc)
	{
		this.name=name;
		this.location=loc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
 
}




public class AdmissionMain {

	public static void main(String[] arg)
	{
		School school1=new School("Anto Matric","Chennai");
		School school2=new School("John's matric","BLore");
		
		List<School> schools=new ArrayList();
		schools.add(school1);schools.add(school2);
		
		Student stud1=new Student("Kala","Maths",200,school1);
		Student stud2=new Student("Raju","Science",180,school1);
		Student stud3=new Student("Vikram","Maths",180,school2);
		Student stud1=new Student("Manju","Maths",160,school1);
		
		
		List<Student> students=new ArrayList<>(Arrays.asList(stud1,stud2,stud3));
		
	}
		
	}
}
