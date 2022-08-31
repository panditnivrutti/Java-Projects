package java_fundamental;

import java.util.Scanner;

public class SumOfAllDigits {
public static void main(String[] args) {
	int num,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	num=s.nextInt();
	while(num!=0)
	{
		int r =(num%10);
		sum=sum+r;
		num=num/10;
	}
	System.out.println(sum);
}
}
