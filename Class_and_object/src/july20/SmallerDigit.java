package july20;

import java.util.Scanner;

public class SmallerDigit {

	public static void main(String[] args) {
		char ch;
		
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Any Number : ");
		int num=s.nextInt();
		int digit;
		int greater = 0;
		int smaller=0;
		 int i=0;
		while(i<num)
		{  digit=num%10;
		if(greater<digit)
		{
			greater=digit;
			
		}
		else
			smaller=digit;
		     num=num/10;
		        i++;
		}
		System.out.println("Smaller digit is : "+smaller); 
	
	}

}
