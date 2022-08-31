package july29;

public class Calculator {

	void add()
	{
		int a,b;
		a=10;b=2;
		System.out.println("Addition is : "+(a+b));
	}
	void substract()
	{
		int a,b;
		a=10;b=2;
		System.out.println("Substraction is : "+(a-b));
		add();
	}
	void mult()
	{
		int a,b;
		a=10;b=2;
		System.out.println("Multiplication is : "+(a*b));
	}
	void power()
	{
		int a,b;
		a=10;b=2;
		System.out.println("Power is : "+(a*a));
	}
	public static void main(String[] args) {
     Calculator c=new Calculator();
     c.add();
     c.substract();
     c.mult();
     c.power();
	}

}
