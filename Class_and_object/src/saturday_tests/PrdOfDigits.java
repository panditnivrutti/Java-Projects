package saturday_tests;

import java.util.Scanner;

public class PrdOfDigits {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter any Number");
int num=s.nextInt();
int prd=1,digit;
while(num>0)
{
	digit=num%10;
	prd=prd*digit;
	num=num/10;
}
  
  System.out.println("Product of Digits is : " +prd);
	}

}
