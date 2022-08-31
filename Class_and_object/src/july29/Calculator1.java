package july29;

import java.util.Scanner;

public class Calculator1 {

		void add(int a,int b)
		{
			System.out.println("Addition is : "+(a+b));
		}
		void substract(	int a,int b)
		{
			System.out.println("Substraction is : "+(a-b));
		}
		void mult(	int a,int b)
		{
			System.out.println("Multiplication is : "+(a*b));
		}
		void power(	int a,int b)
		{
		 int power = 1;
		 for(int i=1;i<=b;i++)
		 {
			 power=power*a;
		 }
		System.out.println("Power is : "+(power));
		}
		
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter any Two Numbers");
			int num1=s.nextInt();
			int num2=s.nextInt();
	     Calculator1 c=new Calculator1();
	     c.add(num1,num2);
	     c.substract(10,2);
	     c.mult(10,2);
	     c.power(10,2);
		}

	}
