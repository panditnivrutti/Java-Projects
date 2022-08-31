package java_fundamental;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter a number to find Factorial");
	int num=s.nextInt();
	int i=1;
	int fact = 1;
	while(i<=num)
	{
		fact=fact*i;
	    	i++;
	}
	System.out.println(fact);
}
}
