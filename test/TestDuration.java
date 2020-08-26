package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class TestDuration {

	@Test
	public void checkDuration()
	{
		//assertEquals("yes","yes");
		
		String output=assertTimeout( Duration.ofMinutes(1),
				()->
		{
			  String s=new TestDuration().changeCase("Mary");
			  return s;
		});
	
		assertEquals("MARY",output);
		
	}
	
	public String changeCase(String s)
	{
		try
		{
		Thread.sleep(50000);
		
		}
		catch(Exception e) {}
		return s.toUpperCase();
		
	}
	
	
	
	
}
