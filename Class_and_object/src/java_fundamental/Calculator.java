package java_fundamental;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	int num1,num2;
	int ans;
	System.out.println("Enter any two numbers");
    Scanner s=new Scanner(System.in);
    num1=s.nextInt();
    num2=s.nextInt();
    System.out.println("Enter 1 for addition");
    System.out.println("Enter 2 for Substraction");
    System.out.println("Enter 3 for multiply");
    System.out.println("Enter 4 for Division");
    ans=s.nextInt();
switch(ans)
{
   case 1: ans=num1+num2;
   System.out.println(num1+"+" +num2+ " = "+ans);
           break;
   case 2: ans=num1-num2;
   System.out.println(num1+"-" +num2+ " = "+ans);
           break;
   case 3: ans=num1*num2;
   System.out.println(num1+"*" +num2+ " = "+ans);
           break;
   case 4: ans=num1+num2;
   System.out.println(num1+"/" +num2+ " = "+ans);
           break;
}
}
}
