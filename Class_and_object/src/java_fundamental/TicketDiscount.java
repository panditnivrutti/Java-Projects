package java_fundamental;

import java.util.Scanner;

public class TicketDiscount {
public static void main(String[] args) {
	System.out.println("Enter your theater name");
	Scanner s=new Scanner (System.in);
	String theat=s.next();
	System.out.println("Enter Movie Name");
	String mov=s.next();
	System.out.println("Enter price of ticket");
	int price=s.nextInt();
	System.out.println("Enter coupon code");
	String code=s.next();
	if(code.equals("GOLD"))
	{ 
		int disc=(price*10)/100;
		price=price-disc;
		System.out.println("Your ticket price is :"+price);
	}
	     else if(code.equals("PLATINUM"))
	{
		int disc=(price*6)/100;
		price=price-disc;
		System.out.println("Your ticket price is :"+price);
	}
	     else if(code.equals("SILVER"))
	{
		int disc=(price*5)/100;
		price=price-disc;
		System.out.println("Your ticket price is :"+price);
	}
	else
	{
		System.out.println("Your ticket price is :"+price);
	}
}
}
