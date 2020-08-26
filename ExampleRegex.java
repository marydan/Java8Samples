import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegex {

	public static void main(String[] args) {
	
		String input="38388";
		String inputdata="345.355";
		
		String month="10-08-1982";
		Pattern patternint=Pattern.compile("[0-8]+");
		Pattern pfloat=Pattern.compile("[0-9[.]]+");
		
		Pattern patdate=Pattern.compile("(0?[1-9]|1[012])[\\/\\-](0?[1-9]|[12][0-9]|3[01])[\\/\\-]\\d{4}");
		Matcher matchdate=patdate.matcher(month);
		
		if(matchdate.matches())
			System.out.println("Valid month");
		else
			System.out.println("Invalid date");
		
//		
		
		Matcher match=patternint.matcher(input);
		Matcher matchdou=pfloat.matcher(inputdata);
//		
	if(match.matches())
	{
		 Integer ans=0;
			System.out.println("String consist of numbers class is " + ans.getClass().getName());
	
	}
//		else
//			System.out.println("Invalid Number");
//		
//		if(matchdou.matches())
//			System.out.println("Input contains Double value");
//		

		
		
	}

}
