package functionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BISample {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("Jan","Feb","Mar","Apr","May");
		List<String> days=Arrays.asList("31","28","31","30","31");
		
		
		BiFunction<String,String,String>  bifun=(mon,dy)->
		{
		//	List<String> strList=new ArrayList();
	//	strList.add(mon + " consists of " + dy) ;
		//System.out.println(mon + dy);
		return mon + "consists of " + dy;
		};
	//	printData(months,days,bifun);
		
		
		Employee employee1=new Employee("Paul",10000);
		Employee employee2=new Employee("Usha",20000);
		
		Map<Employee,String> mapData=new HashMap();
		
		mapData.put(employee1, "Manager");
		mapData.put(employee2, "Developer");
		
	//	mapData.put("manager",employee1); 
		
		BiConsumer<Employee,String> consumeEmploy= (obj,s)->{System.out.println (obj.getName() + " is a " + s);};
		
		mapData.forEach(consumeEmploy);
		
	//	mapData.forEach( (ke,va)-> System.out.println(ke.getName()) );
		
	//	mapData.for
		}
 
	
	static void	printData(List<String> values,List<String> dy,BiFunction bi)
		{
		  
		int i=0;
		   for (String s : values) {
			  String ans=bi.apply(s, dy.get(i) ).toString();
			  System.out.println(ans);
			  i++;
				}

		
		}
	}


