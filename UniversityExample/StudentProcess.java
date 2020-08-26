package UniversityExample;

import java.util.Arrays;
import java.util.List;

class Student
{
	String sname;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	int mark;
	Student()
	{
		
	}
	Student(String n,int mk)
	{
		sname=n;
		mark=mk;
	}
	
  static void checkName(String m)
  {
	   if(m.startsWith("A"))
		   System.out.println(m.toUpperCase());
	   else
		   System.out.println(m.toLowerCase());
		   
  }
	
  void displayName(String a)
  {
	  System.out.println("Welcome " + a);
  }
}

@FunctionalInterface
interface iPopulate
{
	public Student getStudentObject(String n,int m);
}

interface iValidate
{
	boolean validate(String name);
}

public class StudentProcess {

	public static void main(String[] args) {

		iPopulate populate= Student::new;

		Student student1=populate.getStudentObject("Mary", 1120);

//		System.out.println(student1.getSname());
		
		List<String> names= Arrays.asList("Anju","Arun","Mary","Dan");
		
	//	names.forEach(System.out::println);
		
	//	names.forEach(Student::checkName);
		
		names.forEach(new Student()::displayName);
	
		
	}

}
