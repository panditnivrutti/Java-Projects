package inheritance_Super_getter;

public class Person {
	String name,contact,address;
	
	public void setPersonName(String name)
	{
		this.name=name;
	}
	
	public void setPersonContact(String contact)
	{
		this.contact=contact;
	}
	
	public void setPersonAddress(String address)
	{
		this.address=address;
	}
	
	
	public void display()
	{
		System.out.println("Person name : "+name+ "\n Contact No : "+contact+ "\nAddress : "+address);
	}

}
