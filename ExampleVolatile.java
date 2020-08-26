
class Visitor implements Runnable
{
	volatile	 int choice=0;
	
	public int usercount =0;
	
	void setChoice(int choi)
	{
		choice=choi;
	}
	public void run()
	{
		while(choice==0)
			usercount++;
System.out.println("current choice" + choice + "User count " + usercount);
		
	}
}


public class ExampleVolatile {
	
	public static void main(String[] args)  throws Exception{
	 System.out.println("Calling Visitor");
	 Visitor visitor=new Visitor();
	 new Thread(visitor).start();
	 Thread.sleep(1000);
	 
	 System.out.println("After sleep visitor count" + visitor.usercount);
	 visitor.setChoice(1);
	 
		
	}

}
