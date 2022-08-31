package saturday_tests;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter a number");
int num=s.nextInt();
int num1=num;
int count=0,i,prd=1,digit,sum=0;
while(num1>0)
{ 
	 count++;
	 num1=num1/10;
}
          num1=num;
	while(num1>0)
	{
		digit=num1%10;
		prd=1;
		for(i=1;i<=count;i++)
		{
			prd=prd*digit;
		}
			sum=sum+prd;	
		    num1=num1/10;
	}
	if(sum==num)
	{
		System.out.println(num+" : is a armstrong Number");
    }
	else
		System.out.println(num+" : is Not a armstrong Number");
}
}
