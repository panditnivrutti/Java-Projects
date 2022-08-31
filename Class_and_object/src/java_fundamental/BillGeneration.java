package java_fundamental;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
	int pizza;
	int puffs;
	int cooldrink;
	int bill;
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter no.of pizzas bought");
	pizza=s.nextInt();
	System.out.println("enter no.of puffs bought");
    puffs=s.nextInt();
    System.out.println("enter no.of cooldrink bought");
    cooldrink=s.nextInt();
    bill=(pizza*100)+(puffs*20)+(cooldrink*10);
    System.out.println("Bill Details");
	System.out.println("no.of pizzas :" +pizza);
	System.out.println("no.of puffs :" +puffs);
	System.out.println("no.of cooldrink :" +cooldrink);
	System.out.println("totall price =" +bill);
	System.out.println("====================");
	System.out.println("***ENJOY THE SHOW***");
	}

}

