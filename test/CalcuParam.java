package test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.runner.RunWith;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class CalcuParam {

	Calculator calcu=new Calculator();
	
	int inputs,outputs;
	
@Parameterized.Parameters

	public static Collection process()
	{
		
		return Arrays.asList( new Object[][] {{2,4}, {6,36},  {8,64}}  );
				
	}
	
	
	public CalcuParam(int num1,int num2)

	{
		inputs=num1;
		outputs=num2;
	}
	
	@Test
	public void whengivennumberthensquareit()
	{
		assertEquals(outputs,calcu.squreIt(inputs));
	}
	
	

	
	 
}
