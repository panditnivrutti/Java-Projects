package java_fundamental;

import java.util.Scanner;

public class DivisibleBY {
public static void main(String[] args) {
	System.out.println("Enter any number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num%8==0&&num%3==0)
	{System.out.println("Number is Divisible by 8 & 3");}
	else
	{
		System.out.println("Number is not divisible by 8 and 3");
	}
}
}
