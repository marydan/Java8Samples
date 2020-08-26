package UniversityExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Result
{
	int mark;
	String name;
	Result(String n,int mk)
	{
		name=n;
		mark=mk;
		
	}
	
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void checkDetails(Consumer con)
	{
		con.accept(name);
		
	}
	
}

public class ProcessResult {

	public static void main(String[] args) {
	
		Predicate<String> pretest=(val)->val.contains("ustg");

		
		List<String> mailids=Arrays.asList("sandip@ustg.com","vinayak@ustg.com","mary@stackroute.in");
		
	  //  printUstgDetails(mailids,pretest);
	    
	    Result result1=new Result("mary@stackroute.in",480);
	    
	    
	    
	    Result result2=new Result("sandip@ustg.com",485);
	    Result result3=new Result("vinayak@ustg.com",490);
	
	    List<Result> results=Arrays.asList(result1,result2,result3);
	    
	    Predicate<Result> prename=(res)->res.getName().contains("ustg");
	    
	    
	    
	    Predicate<Result> premark=(res)->res.getMark()>485 ;
	   
	    
	    
	    
	    
//	      printTopperUstg(results,prename,premark);
	      
	      Consumer<Result> consconvert=(r)->
	      								{
	      									if(r.getMark()>480)
	      									System.out.print(r.getName().toUpperCase());
	      								};
	    
	   
	      								
	      								
	      								
	      Consumer<Result> consdisp=(r)->System.out.print("-----");
	    //  	results.forEach(consconvert);
	      	
	    
	      
	      Consumer resultconsumer=consconvert.andThen(consdisp);
	      
	      results.forEach(resultconsumer);
	      
	      
	      //  Consumer<String> consname=(s)->System.out.println(" Name length is  " + s.length());
		     
	     // result1.checkDetails(consname);
	      
	     // result2.checkDetails(con);
	      
	   //   print(PersonData,prefilter);
	    
	} // main
	
	
	static void print (List<Result> resultlist,Predicate prenm )
	{
		for(Result result : resultlist )
		{
			 
			
			if(prenm.test(result))
				System.out.println("Topper " + result.getName());
			
		}
		
	}
	
	
	
	
	static void printTopperUstg(List<Result> resultlist,Predicate prenm,Predicate premk)
	{
		for(Result result : resultlist )
		{
			Predicate<Result> precheck=prenm.and(premk);
			
			if(precheck.test(result))
				System.out.println("Topper " + result.getName());
			
		}
		
	}
	
	
	
	
	

//	static void printUstgDetails(List<String> nms,Predicate p)
//	{
//		for(String n : nms)
//		{
//			if(p.test(n))
//				System.out.println(n);
//		}
//	}
	
}
