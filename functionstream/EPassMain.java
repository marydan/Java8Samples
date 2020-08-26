package functionstream;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EPassMain {

	public static void main(String[] args) {

		Passenger pass1=new Passenger("Rekha",34,"Chennai");
		Passenger pass2=new Passenger("Vikram",44,"Delhi");	
		Passenger pass3=new Passenger("Raju",64,"Chennai");
		Passenger pass4=new Passenger("Mary",85,"Blore");

		List<Passenger> passengers=Arrays.asList(pass1,pass2,pass3,pass4);
		
		
		
		
		
		Map<String,Double> mapanswer=passengers.stream()
										.collect(Collectors.groupingBy( p->p.getDestination(),Collectors.averagingInt(Passenger::getAge)));
	//	mapanswer.forEach( (k,v)->System.out.println("in city " + k + "Average age is " + v));
		
		

		Map<String,List<Passenger>> mapanswer1=passengers.stream()
				.collect(Collectors.groupingBy(Passenger::getDestination));
		
	//	mapanswer1.forEach( (k,v)->System.out.println(v));
		
		
		Map<String,List<String>> mapname=passengers.stream()
				.collect(Collectors.groupingBy( Passenger::getDestination , Collectors.mapping( pass->pass.getName(), Collectors.toList())));
		
		
		 mapname.forEach((k,v)->System.out.println(k + ":" + v));
		
		LinkedList<Integer> passengerfilter=passengers.stream().
				collect(Collectors.groupingBy(Passenger::getDestination,Collectors.summingInt(Passenger::getAge)))
					.values().stream().collect(Collectors.toCollection(LinkedList::new));
		
		
		//passengerfilter.forEach(System.out::println);
		
		
		List<Integer> listnumbers=IntStream.iterate(1, num->num*5).mapToObj(Integer::valueOf).limit(10)
									.collect(Collectors.toList());
		
				
		listnumbers.forEach(System.out::println);		
				
		
//		
//	long count=passengers.stream().filter( p-> p.getDestination().equals("Chennai")).count();	
//	
////	System.out.println("Passengers to Chennai" + count);
//		
//OptionalInt maxage=passengers.stream().filter( p-> p.getDestination().equals("Chennai"))
//								.mapToInt( pass-> pass.getAge())
//								.max();
////System.out.println("Max age of passenger" + maxage.getAsInt());
////
////boolean find=passengers.stream().anyMatch(p->p.getAge()>60);
////
////	System.out.println("boolean" + find);
////
////	
////Map<Boolean, List<Passenger>> passengerresult=passengers.stream()
////										.collect(Collectors.partitioningBy( (pass)-> pass.getDestination().equals("Chennai")));
////
////passengerresult.forEach( (ky,pass)-> 
////		{
////			//System.out.println(pass);
////			
////			pass.forEach( p -> System.out.print(p.getName()+ ":" + p.getDestination()));
////		   
////			System.out.println();
////		});
////	
//
//
////Map<String,List<Passenger>> mapage=passengers.stream()
////								   .collect(Collectors.groupingBy( pass->pass.getDestination()));
////
////	mapage.forEach( (ke,val)->
////	{
////		
////	System.out.println(ke);
////	val.forEach(  p-> System.out.println(p.getName() + ":" + p.getDestination()));
////	System.out.println("-----------------");
////	});
////	
//
Map<Object, Double> mpass1=passengers.stream()
								   .collect(Collectors.groupingBy(Passenger::getDestination,Collectors.averagingInt(Passenger::getAge)));
//																	
//
mpass1.forEach( (k,v) -> System.out.println("key is " + k + "value is " + v ));
//
//Map<Object, Double> mpass2=passengers.stream().filter( p ->p.getAge()>40).skip(2)
//.collect(Collectors.groupingBy(Passenger::getDestination,Collectors.averagingInt(Passenger::getAge)));
//
//
//mpass2.forEach( (k,v) -> System.out.println("key is " + k + "value is " + v ));
//
//
//LinkedList lst=passengers.stream().collect(Collectors.toCollection(LinkedList::new));
//
//

	}

}
