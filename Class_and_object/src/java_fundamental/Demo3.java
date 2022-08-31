package java_fundamental;

import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	System.out.println("Enter Your city");
	Scanner s=new Scanner (System.in);
	String city=s.next();
	if(city.equals("Mumbai"))
	{
	System.out.println("best places to visit are Marine Drive,Taj Hotel,");
	}
	else if(city.equals("Agra"))
	{
		System.out.println("best places to visit Taj mahal");
	
	}
}
}
