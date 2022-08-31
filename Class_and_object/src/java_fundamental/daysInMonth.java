package java_fundamental;

import java.util.Scanner;

public class daysInMonth {
public static void main(String[] args) {
	System.out.println("Enter a  month(First letter should be capital)");
	Scanner s=new Scanner(System.in);
	String month=s.next();
	 if(month.equals("February"))
	 {
      System.out.println(month+" Have 28 days or 29 in leap year.");		 
	 }
	 else if(month.equals("January"))
	 {
		 System.out.println(month+" Have 31 days. ");		 
	 } 
	 else if(month.equals("March"))
	 {
		 System.out.println(month+" Have 31 days. ");		 
	 } 
	 else if(month.equals("May"))
	 {
		 System.out.println(month+" Have 31 days.");		 
	 } 
	 else if(month.equals("July"))
	 {
		 System.out.println(month+" Have 31 days. ");		 
	 } 
	 else if(month.equals("September"))
	 {
		 System.out.println(month+" Have 31 days. ");		 
	 } 
	 else if(month.equals("November"))
	 {
		 System.out.println(month+" Have 31 days. ");		 
	 }
	 else if(month.equals("April"))
	 {
		 System.out.println(month+" Have 30 days. ");		 
	 } 
	 else if(month.equals("June"))
	 {
		 System.out.println(month+" Have 30 days. ");		 
	 } 	
	 else if(month.equals("August"))
	 {
		 System.out.println(month+" Have 30 days. ");		 
	 } 	
	 else if(month.equals("October"))
	 {
		 System.out.println(month+" Have 30 days. ");		 
	 } 
	 else if(month.equals("December"))
	 {
		 System.out.println(month+" Have 30 days. ");		 
	 } 	
	 else
	 {
		 System.out.println(" Please enter valid input. ");		 
	 } 	 
	 } 
}

