package july22;

import java.util.Scanner;

public class Multiplication {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("Enter Limit");
	int limit=s.nextInt();
	int evenprd=1,oddprd=1;
	
	for(int i=1;i<=limit;i++)
	{
		if(i%2==0)
		{
			evenprd=evenprd*i;
		}
		else
		{
			oddprd=oddprd*i;
		}
	}
	System.out.println("Product Of Even numbers :"+evenprd);
	System.out.println("Product of Odd numbers :"+oddprd);
}
}
