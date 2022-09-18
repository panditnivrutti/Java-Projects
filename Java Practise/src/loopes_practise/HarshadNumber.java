package loopes_practise;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter a Number : ");
   int num=s.nextInt();
   int num1=num;
   int sum=0;
   for (int i=1;num1!=0;i++)
   {
	   int digit =num1%10;
	    sum=sum+digit;
	    num1=num1/10;
   }
   if (num%sum==0)
   {
	   System.out.println(num+" : Harshad Number");
   }
   else 
   {
	   System.out.println(num+" : Not Harshad Number");
   }
	}

}
