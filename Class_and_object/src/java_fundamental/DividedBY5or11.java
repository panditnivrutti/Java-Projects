package java_fundamental;

import java.util.Scanner;

public class DividedBY5or11 {
public static void main(String[] args) {
	System.out.println("Enter any number to check divisible by 5 and 11");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%5==0&&num%11==0)
	{
		System.out.println( num+" is Divisible by 5 and 11 ");
	}
	else
	{
		System.out.println( num+" is not Divisible by 5 and 11 ");
	}
}
}
