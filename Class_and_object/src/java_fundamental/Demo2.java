package java_fundamental;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		String item;
		int price;
		int qty;
		System.out.println("Enter any item");
		Scanner s=new Scanner(System.in);
		item=s.next();
		System.out.println("Enter Price");
		price=s.nextInt();
		System.out.println("Enter Quantity");
		qty=s.nextInt();
		price=qty*price;
		
		System.out.println(item);
		System.out.println("Totall Price ="+price);
       
	}

}
