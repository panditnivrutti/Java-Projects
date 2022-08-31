package java_fundamental;

import java.util.Scanner;

public class BirthdayGift {
	public static void main(String[] args) {
		int coin,age;
		System.out.println("Enter age of Meenu ");
		Scanner s=new Scanner(System.in);
		age=s.nextInt();
		coin=age*age*age;
		
		if(age>0)
		{
			System.out.println("MEENU gets "+coin+" Coins...");	
		}
		else
		{
			System.out.println("Please enter valid age");
		}
		
		
		
	}

}
