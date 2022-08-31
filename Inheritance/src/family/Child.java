package family;

public class Child extends Father {
	String name;
	public void SetChildData(String name)
	{
		this.name=name;
	}
	
	public void Display()
	{
		super.Display();
		System.out.println(" Name : "+name+" "+super.name+" "+lastName);
	}

}
