package family;

public class Father extends Grandfather {
	String name;
	
	public void setFatherData(String name)
	{
		this.name=name;
	}
	
	public void Display()
	{
		super.Display();
	
	 Grandfather g=new Father();
		System.out.println("Father Name : "+name+" "+super.name+" "+lastName);
	}

}
