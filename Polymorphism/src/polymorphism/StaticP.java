package polymorphism;

public class StaticP {
	void add(int a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}

	void add(int a,float b)
	{
		System.out.println("Addition = "+(a+b));
	}
	void add(String a,int b)
	{
		System.out.println("Addition = "+(a+b));
	}

	void add(String a,String b)
	{
		System.out.println("Addition = "+(a+b));
	}
	
	void add(int a,int b,String c)
	{
		System.out.println("Addition = "+(a+b+c));
	}

	public static void main(String[] args) {
		
		StaticP s=new StaticP();
		
		s.add(12, 15.00f);
		s.add(12, 120);
		s.add("niv", 12);
		s.add("Nivrutti", "Pandit");
		s.add(11, 12, "Nivrutt");

	}

}
