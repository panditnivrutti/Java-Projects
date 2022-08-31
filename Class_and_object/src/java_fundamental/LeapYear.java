package java_fundamental;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	int year;
	System.out.println("Enrer a year");
	Scanner s=new Scanner (System.in);
	 year=s.nextInt();
	 if ((year % 4 == 0) && (year % 100!= 0))
         System.out.println("Given  year is a leap year");
      else
         System.out.println("Given year is not a leap year");
} 
}
