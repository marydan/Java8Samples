package functionstream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Market
{
//	String fruit;
//	String colour;
//	constructor, getter,setter
}

public class Practice1 {
	static List<String> fruits;
	public static void main(String[] args) {
		fruits=Arrays.asList("Apple","Orange","Mongo","Apple","Apricot");
		
	findColour("Apple");
	
	}
	
	static void findColour(String fruitname)
	{
//	Predicate<String> pre= (str)->(str==fruitname);
//		
//		for (String st : fruits)
//		{
//			if (pre.test(st))
//			System.out.println("Found " + st);
//		}
		
		
		List<String> filtered=fruits.stream().filter( f->f==fruitname ).collect(Collectors.toList());
		
		filtered.forEach(System.out::println);
		
		
		
		
	}

}
