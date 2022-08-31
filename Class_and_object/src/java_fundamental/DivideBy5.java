package java_fundamental;

import java.util.Scanner;

public class DivideBy5 {
public static void main(String[] args) {
	int num1;
	int rem;
	System.out.println("Enter any number to check it is divisible by 5 or not");
	   Scanner s=new Scanner (System.in);
	   num1=s.nextInt();
    rem=num1%5;
	if(rem==0)
		
	{
   System.out.println("Given number is divisible by 5");
	}
	else
	{
		   System.out.println("Given number is Not divisible by 5");
	}
}
}
