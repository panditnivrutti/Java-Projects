package java_fundamental;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
    String item;
    float price;
    
    float disc;
	System.out.println("Enter any item");
    Scanner s=new Scanner(System.in);
    item=s.next();
    System.out.println("nter Price of Pizza");
    price=s.nextInt();
    System.out.println(item);
    System.out.println(item+ "="+price );
    
	 disc=price*10/100;
	 System.out.println("Discount :" +disc);
	price=price-disc; 
	System.out.println("Discounted price = "+price);
		
		
	}

}
