package functionstream;

public class Passenger implements Comparable{

	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	int age;
	String destination;
	Passenger(String nm,int a,String des)
	{
		name=nm;
		age=a;
		destination=des;
	}
	
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true;
		if(! (obj instanceof Passenger) )
			return false;
	Passenger pass=(Passenger) obj;
	return(this.name.equalsIgnoreCase(pass.getName()));
	
	}
	
	public int hashCode()
	{
		int hasval=1;
		hasval=hasval*17 + this.getName().hashCode();
		return hasval;
	}
	@Override
	public int compareTo(Object obj) {
	 
		Passenger pass2=(Passenger) obj;
		
		return this.age-pass2.age;
		
		
		//return 0;
	}
	
	public String toString()
	{
		return "Name is" + name  + " Age is " + age + " destination " + destination ;
	}
	
}
