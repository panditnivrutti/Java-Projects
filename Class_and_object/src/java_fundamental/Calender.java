package java_fundamental;

import java.util.Scanner;

public class Calender {
public static void main(String[] args) {
	int days;
	int year;
	int month;
	int week;
	System.out.println("Enter days to convert into months,weeks,and days ");
	Scanner s=new Scanner(System.in);
	days=s.nextInt();
	year= days/365;
	days=  days%365;
	month= days/12;
	days=  days%12;
	week= days/7;
	days= days%7;
	System.out.print(year+" years ");
	System.out.print(month+" Months ");
	System.out.print(week+" Weeks ");
	System.out.print(" and "+days+" days ");
	
	
}   
}
