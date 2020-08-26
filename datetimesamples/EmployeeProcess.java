package datetimesamples;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeProcess {

	static Employee[] employees;
	public static void main(String[] args) throws Exception{
		
		
//		Employee employee1=new Employee("Rose",LocalDate.of(1980,10, 25),LocalDate.of(2019, 10, 20),25000);
//
//		LocalDate today=LocalDate.now();
//		
//		Period perage=Period.between(employee1.getDateofbirth(),today);
//		
//		Period perexp=Period.between(employee1.getDateofjoin(),today);
		
//		System.out.println("Age is " + perage);
//		System.out.println("Expr is " + perexp.getYears() + " : " + perexp.getMonths() + " : " + perexp.getDays());
//		
	
		Path path=Paths.get("E:\\1-ust-wave9\\niosample\\employeedata.csv");

		//		List<String> alllines = Files.readAllLines(path);
		
		
		BufferedReader br=Files.newBufferedReader(path);
		Stream<String> streamfile=br.lines();
		List<String> lstlines=streamfile.collect(Collectors.toList());
		
		
		//lstlines.forEach(System.out::println);
		
		generateEmp(lstlines);
		
	
		List<Employee> listemp=Arrays.asList(employees);
		
		//listemp.forEach( p-> System.out.println(p.getName()));
		
		
//	List<LocalDate> dobs=listemp.stream().map(per->per.getDateofbirth()).sorted( (per1,per2)->per1.compareTo(per2)).collect(Collectors.toList());
//	
//	dobs.forEach(System.out::println);
		
		
//		List<Employee> emps=listemp.stream().sorted( (per1,per2)->per1.getDateofbirth().compareTo(per2.getDateofbirth())).collect(Collectors.toList());
//			emps.forEach(System.out::println);	
//		
//		Optional<Employee> emp=listemp.parallelStream().min(Comparator.comparing(Employee::getDateofjoin));
//		
//		System.out.println("Senior employee is ");
//		if(emp.isPresent())
//		{
//		Employee empobj=emp.get();
//		System.out.println(empobj);
//	
//		}
//		
//		OptionalDouble ansavg=listemp.parallelStream().mapToDouble(Employee::getSalary).average();
//		
//		if(ansavg.isPresent())
//			System.out.println("Average of Salary" + ansavg.getAsDouble());
//		
		
		displayAllFiles("E:\\1-ust-wave9\\niosample");
	//   System.out.println(employees[0].getName() + "date of bir" + employees[0].getDateofbirth());	
		
	} // main

	
	static boolean isRetired(LocalDate dob)
	{
		LocalDate today=LocalDate.now();
		Period pdiff=Period.between(dob, today);
	//System.out.println(pdiff.getYears());
		if(pdiff.getYears()>=58)
			return true;
		else
			return false;
		
	}
	
	
	static void generateEmp(List<String> data)
	{
		employees=new Employee[data.size()];
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		int i=0;
		for(String s : data)
		{
			
			String record[]=s.split(",");
	//	 System.out.println(record[0] + " date of birt" + record[1]);	
		 
		 employees[i]=new Employee(record[0],LocalDate.parse(record[1],dt),LocalDate.parse(record[2],dt),Integer.parseInt(record[3]));
		
		  if(isRetired(employees[i].getDateofbirth()))
			System.out.println("Employee" + employees[i].getName() + "Is Retired");
		  
			  
		 i++;
		}
	} 
	
	public static void displayAllFiles(String url) throws Exception
	{
		Path path=Paths.get(url);
		
		try(Stream<Path>  s=Files.walk(path))
		{
		 List<Object> lstfile=  s.map( fn->fn.toString() ). filter(fname->fname.endsWith(".txt")).collect(Collectors.toList());
	  
		 lstfile.forEach(System.out::println);
		}
		catch(Exception e) {}
		
	}
	
}
