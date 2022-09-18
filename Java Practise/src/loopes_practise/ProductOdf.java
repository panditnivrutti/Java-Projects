package loopes_practise;

import java.util.Scanner;

public class ProductOdf {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number of multiple Digits : ");
	int num=s.nextInt();
	int prd=1;
	for(int i=1;num!=0;i++)
	{   
		int digit=num%10;
		 prd=prd*digit;
		 num=num/10;
		
	}
	System.out.println("product : "+prd);
}
}
