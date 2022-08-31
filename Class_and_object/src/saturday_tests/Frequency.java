package saturday_tests;

import java.util.Scanner;

public class Frequency {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=s.nextInt();

	int i,digit,digit1,freq=0;
	for(i=0;i<=9;i++)
	{
		int num1=num;
		freq=0;
		for(;num1!=0;)
		{
			digit1=num1%10;
			
			
			if(digit1==i)
			{
				freq++;
			}
			
			num1=num1/10;
			
		}
		if(freq>0)
		System.out.println(i+" : "+freq);
			
	}
	
}
}
