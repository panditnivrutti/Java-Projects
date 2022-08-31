package java_fundamental;

import java.util.Scanner;

public class MickySoftware {
public static void main(String[] args) {
	int hrs;
	int amtofday;
	int amtofyr;
	System.out.println("Enter no of hours worked in a day :");
	Scanner s=new Scanner (System.in);
	hrs=s.nextInt();
	if(hrs<=24&&hrs>=0)
	{
		amtofday=hrs*100;
		amtofyr=amtofday*365;
		System.out.println(" Total income in a year: "+amtofyr+" Rs");
	}
	else
{
  System.out.println("Unable to calculate the earnings");		
}
}
}
