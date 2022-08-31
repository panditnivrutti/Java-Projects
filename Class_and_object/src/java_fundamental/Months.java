package java_fundamental;

import java.util.Scanner;

public class Months {
public static void main(String[] args) {
	System.out.println("Enter a month");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	System.out.println("Enter a year");
	int yr=s.nextInt();
	switch(num)
	{
	case 1 : System.out.println("January = 31 days");
	                break;
	case 2 : if (yr%4==0)
		System.out.println("February  = 29 days");
	        else
	        	System.out.println("February = 28 days");
	                 break;
	case 3 : System.out.println("march = 31 days");
	                 break;
	case 4 : System.out.println("April = 30 days");
	                 break;
	case 5 : System.out.println("May = 31 days");
	                 break;
	case 6 : System.out.println("June = 30 days");
	                 break;
	case 7 : System.out.println("July = 31 days");
	                 break;
	case 8 : System.out.println("August = 30 days");
	                 break;
	case 9 : System.out.println("Septber = 31 days");
	                 break;
	case 10: System.out.println("October = 30 Days");
	                 break;
	case 11 :System.out.println("November = 31 days");
	                 break;
	case 12 :System.out.println("December = 30 days");
	                  break;
	default :System.out.println("Enter valid input"); 
	}
}
}
