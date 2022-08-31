package Bikes;

public class Bikes extends Company{
	String b1,b2,b3;
	public void setData(String b1,String b2,String b3)
	{
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
	}
	
	public void Display()
	{    super.Display();
		System.out.println("Bikes : 1) "+b1);
		System.out.println("        2) "+b2);
		System.out.println("        3) "+b3);
	}

}
