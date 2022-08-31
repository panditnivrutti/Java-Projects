package family;

public class Grandfather {
	String name, middleName ;
	static String lastName;
	
	public void setGrandfatherData(String name,String middleName,String lastName )
	{
		this.name=name;
		this.middleName=middleName;
		this.lastName=lastName;
		
	}
	
	public void Display()
	{
		System.out.println("Grandfather's Name : "+name+ " "+middleName+" "+lastName );
	}
}
