package functionstream;

interface iVehicle
{
}

class Car implements iVehicle
{
	String company;
}

class Bus implements iVehicle
{
	String bustype;
	int maxcount;
}

class Person 
{
	String name;
	String id;
}
public class MarkerSample {

	public static void main(String[] args) {
	
		iVehicle vehicle1=new Car();
		iVehicle vehicle2=new Bus();
		Person person=new Person();
  
		logDetails(vehicle1);
	}

	
	static void logDetails(iVehicle vehicle)
	{
		if(vehicle instanceof Car)
		System.out.println("Storing details of Car class. To check licence");
		else if(vehicle instanceof Bus)
		System.out.println("Bus not allowed as of now");
	}
}
