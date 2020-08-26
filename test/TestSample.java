package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class TestSample {

	Tablet tablet=new Tablet("Crocin",5,100);
	
	
	@Test
	void whentablenameisnullreturnfalse()
	{
		tablet.setTabname("");
		assertFalse(tablet.validateTabname());
	}
	
	
	@DisplayName("CostCheck")
	@RepeatedTest(2)

	@Test
	void whenCalucatecostthenreturnvalue() {
	 assertEquals(500,tablet.calculateCost());
	}

	@DisplayName("CheckPrice")
	@Test
	void checkfornonnegativepriceValue() {
		assertTrue(tablet.validatePrice());
	}
	
	@Test
	void checklengthforTabname() {
		assertEquals(true,tablet.validateTabname());
	}
	
	@Test
	void checkfortabNotnullandvalidate()
	{
		assertAll("Checking not null",
				
				()-> assertEquals("Crocin",tablet.getTabname()),
				()->assertEquals(true,tablet.validateTabname())
				
				);
		
		}
	
	@Test
	void whentabnamenotnullthencalculateprice()
	{
		
		assertAll("checking tablet",
				
		        ()->{
		        	String tname=tablet.getTabname();
		        	
		        	assertNotNull(tname);
		        	assertTrue(tablet.validatePrice());
		        	
		        	assertAll("calcuate price",
		        			()->assertTrue(tablet.validatePrice()),
		        			()->assertEquals(500,tablet.calculateCost())
		        			);
		        	
		        	
		        } //outer assertal
				
				
				
				);
		} //test
	
	
	
	 @Test
	 
	 void whenQtynegativethenexpectingException() throws NegativeQtyException
	 {
//		if (tablet.getQty()<0)
//		{
		 	tablet.setQty(-10);
		 Exception excp=assertThrows(NegativeQtyException.class,
				 ()->tablet.validateQty()
				  );
				 
		 assertEquals("Qty<0" , excp.getMessage());
		
	 }
	 
	 
	//	else
	 // assertEquals(true,tablet.validateQty());
	 //}
	 
	
	 
	 
	 @Test
	void whenQtyispossitivethenexpectingOutput()
	{
		 
//		 Exception excp=assertThrows(NegativeQtyException.class,
//				 ()->tablet.validateQty()
//				  );
//				 
//		 assertNotEquals("Qty<0" , excp.getMessage());
//		 
		// assertFalse()
	}
	
	
}
