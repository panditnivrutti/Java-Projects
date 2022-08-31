package inheritance_superkeyword;

public class Person {
	String name,contact,address;
	public void setPersonData(String name,String contact,String address)
	{
		this.name=name;
		this.contact=contact;
		this.address=address;
	}
	
	public void display()
	{
		System.out.println("Person name : "+name+ "\n Contact No : "+contact+ "\nAddress : "+address);
	}

}
