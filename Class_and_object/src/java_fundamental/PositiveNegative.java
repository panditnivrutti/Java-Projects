package java_fundamental;

import java.util.Scanner;

public class PositiveNegative {
public static void main(String[] args) {
	 int num;
	 System.out.println("Enter any number");
	 Scanner s=new Scanner(System.in);
	 num=s.nextInt();
	 if(num>0)
	 {
		 System.out.println("Given number is positive");
	 }
	   else if(num<0)
		{
		   System.out.println("Given number is negative");   
	   }
	   else
	   {
		 System.out.println("Given number is zero");
	   }
}    
}
