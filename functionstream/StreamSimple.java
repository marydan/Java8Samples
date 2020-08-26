package functionstream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamSimple {

	public static void main(String[] args) {
	
		List<String> fruits=Arrays.asList("Apple","Orange","Mongo","Apple","Apricot");
		
//		Predicate pre=

//	List<String> filteredList=fruits.stream().filter( s->s.startsWith("A")).collect(Collectors.toList());

//	List<String> filteredList=fruits.stream().limit(3).filter( s->s.startsWith("A")).collect(Collectors.toList());

	//	List<String> filteredList=fruits.stream().skip(3).filter( s->s.startsWith("A")).collect(Collectors.toList());
	
	//	List<String> filteredList=fruits.stream().distinct().filter( s->s.startsWith("A")).collect(Collectors.toList());
//		filteredList.forEach(System.out::println);
		
		
		Optional<String> optAnswer=fruits.stream().filter( s->s.startsWith("C")).findFirst();

		
		
//		if(optAnswer.isPresent())
//			System.out.println(optAnswer.get());
//		
//		
	Optional<String> optfind=fruits.stream().filter( s->s.startsWith("A")).filter( s->s.contains("P")).findAny();

		
		if(optfind.isPresent())
			System.out.println(optAnswer.get());
		else
			System.out.println("No fruits with name starts with C");
		
		
		
	//	System.out.println(optfind.get());
		
		
		
		
//		else
//		optAnswer.orElse("No Fruits");
//	
	//String[] name;
	

	}

}
