abstract class Animal
{
	abstract void foodHabbit(String type);
	void displayNature()
	{
		System.out.println("Animals are friendly");
		
	}
}

interface iDisplay
{
	void printDetailsonScreen();
	void printOnPrinter();
	void storeOnFile();
	default void getPurpose(String s)
	{
		System.out.println("Need for Print is " + s);
	}
}


public class ExampleAnanym {

	public static void main(String[] args) {
	
	
		iDisplay displayscores=new iDisplay()
								{
									public void printDetailsonScreen()
									{
										System.out.println("Display on monitor");
									}
									public void printOnPrinter()
									{
										System.out.println("Print it in network printer");
									}
									public void storeOnFile()
									{
										System.out.println("Printing on a file");
									}
									public void getPurpose(String a)
									{
										System.out.println("Display Scores of " + a);
									}
								};
		
		displayscores.printOnPrinter();
		displayscores.printDetailsonScreen();
		displayscores.getPurpose(" Employee " );
		
		
		
		
		
		
		
		
//		Animal animal=new Animal() {
//									void foodHabbit(String s) {
//										 if(s.equals("Wild"))
//										System.out.println("Eats Anything ");
//										 else if(s.equals("Pet"))
//											 System.out.println("Only Veg");
//				 			
//										}
//			
//									};
//									
//	//	Animal animal2=
//			
//					animal.foodHabbit("Wild");
//					animal.displayNature();
//		
//		

	}
	
	

}
