package saturday_tests;

import java.util.Scanner;

public class IndexPower {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter base :");
int num=s.nextInt();
System.out.println("Enter its Index");
int pwr=s.nextInt();
int prd = 1, i;
for (i=1;i<=pwr;i++)
{
	prd=prd*num;
	}
System.out.println("Power of "+num+" is : "+prd);

	}

}
