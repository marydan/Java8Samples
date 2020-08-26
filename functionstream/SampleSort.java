package functionstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;



public class SampleSort {

	static List<String> listcities;
	public static void main(String[] args) {
		Passenger pass1=new Passenger("Rekha",34,"Chennai");
		Passenger pass2=new Passenger("Vikram",44,"Delhi");	
		Passenger pass3=new Passenger("Raju",64,"Chennai");
		Passenger pass4=new Passenger("Mary",85,"Blore");

		List<Passenger> passengers=new ArrayList<>(Arrays.asList(pass1,pass2,pass3,pass4));
		
		Collections.sort(passengers);
		
//	passengers.forEach(System.out::println);
		
		
	 listcities=new ArrayList<>(Arrays.asList("Agra","Cochin","Mumbai","Chennai","Angamali","Delhi","Agra"));

	// listcities=new ArrayList();
//	
		
//		listcities.sort( (a, b)->a.compareTo(b));
		
//		
//		
	 
	 
	 listcities.removeIf(s->s.contains("Agra"));
//		
// 
////		
//		listcities.forEach(System.out::println);
//		
//		//ListIterator iterator=listcities.listIterator();
//		
//		//iterator.next();
//		//iterator.remove();
		
		
	//	listcities.removeAll(s);
		
      //  listcities.rem
		

       //listcities.forEach(System.out::println);		
		
		Comparator comparecity= (obj1,obj2)->{
					if(obj1.toString().compareTo(obj2.toString())==0)
							return 0;
					else if (obj1.toString().compareTo(obj2.toString())<0)
						  return -1;
					else
						return 0;
		};
		
	//	listcities.sort(co);
//		
//		
		listcities.sort(comparecity);
		listcities.forEach(System.out::println);		
		
		
		
//		String[] s;
//		Map mp=new HashMap();
		
		//listcities.stream().so
//		listobj=filter , based on the given country
//		listcities.removeAll(listobj);
		
	//	listcities.forEach(System.out::println);
		
		//listcities.rem
		
		
		
		}
		
		
//				static void deleteRec(String p)
//				{
//					try {
//					//	List<String> s=listcities.stream().filter(ss->ss.startsWith("A")).collect(Collectors.toList());
//						listcities.removeIf(s->s.equals(p));
//		//				listcities.forEach(System.out::println);
//						}
//								catch(Exception e)
//								{
//									System.out.println(e);
//								}
//								
//				}

	}


