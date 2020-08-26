package functionstream;

import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

class Employee
{
	String name;
	int salary;
	Employee(String n,int s)
	{
		name=n;
		salary=s;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}


public class FunctionProcess {

	static int count=0;
	static int getCount()
	{
		return count;
	}
	
	public static void main(String[] args) {
	
		
		Employee employee=new Employee("Paul",10000);
		Function<Employee,Integer> funPF= (e)->e.getSalary()*14/100;
		Integer pf=funPF.apply(employee); 
	//	System.out.println(pf.intValue());
		FunctionProcess.count++;
		

		Function<String,Integer> funString= Integer::parseInt;
		
		System.out.println(15* funString.apply("300"));
		FunctionProcess.count++;
		
		Supplier supplyusercount= FunctionProcess::getCount;
		
		System.out.println("Visitor count is " + supplyusercount.get());
		
		Supplier suppdate1= ()->{return new Date();};
		
		System.out.println(suppdate1.get());
		
	};

}
