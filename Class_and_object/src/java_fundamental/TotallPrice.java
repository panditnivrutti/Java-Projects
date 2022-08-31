package java_fundamental;

import java.util.Scanner;

public class TotallPrice {
public static void main(String[] args) {
	System.out.println("Enter any item");
	Scanner s=new Scanner (System.in);
	String item=s.next();
	System.out.println("Enter Price of item");
	int price=s.nextInt();
	int totall=0;
	if(price>=50000)
	{
	System.out.println("Excellent quality");
	System.out.println("how many qty you required");
	int qty=s.nextInt();
	totall=qty*price;
	System.out.println("Totall price of "+item+" =:"+totall);
	}
	else if(price>=25000)
	{
		System.out.println("Excellent quality");
		System.out.println("how many qty you required");
		int qty=s.nextInt();
		totall=qty*price;
		System.out.println("Totall price of "+item+" =:"+totall);
	}
	else
	{
		System.out.println("Poor Quality");
	}
}
}
