package java_fundamental;

import java.util.Scanner;

public class Calci {
public static void main(String[] args) {
	int num1,num2;
	int ans;
	System.out.println("Enter your choice");
    System.out.println("Enter 1 for addition");
    System.out.println("Enter 2 for Substraction");
    System.out.println("Enter 3 for multiply");
    System.out.println("Enter 4 for Division");
    Scanner s=new Scanner(System.in);
    int ch=s.nextInt();
    
switch(ch)
{
   case 1: System.out.println("Enter any two numbers");
  
   num1=s.nextInt();
   num2=s.nextInt();
   ans=s.nextInt();
	   ans=num1+num2;
   System.out.println(num1+"+" +num2+ " = "+ans);
           break;
   case 2: System.out.println("Enter any two numbers");
  
   num1=s.nextInt();
   num2=s.nextInt();
   ans=s.nextInt();
	   ans=num1-num2;
   System.out.println(num1+"-" +num2+ " = "+ans);
           break;
   case 3:
	   System.out.println("Enter any two numbers");
	   
	   num1=s.nextInt();
	   num2=s.nextInt();
	   ans=s.nextInt();ans=num1*num2;
   System.out.println(num1+"*" +num2+ " = "+ans);
           break;
   case 4:System.out.println("Please Do not enter '0'");
   
	   System.out.println("Enter any two numbers");
	   
	   num1=s.nextInt();
	   num2=s.nextInt();
	   if(num2==0)
	   {
		   System.out.println("Denomenator cannot be '0'");
		   System.out.println("Please enter denomenator again");
		   num2=s.nextInt();
	   }
	   
	   else
		   ans=s.nextInt();ans=num1/num2;
   System.out.println(num1+"/" +num2+ " = "+ans);
           break;
  default : System.out.println("Please Enter Valid input");
}
}
}
