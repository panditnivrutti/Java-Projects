package loopes_practise;

import java.util.Scanner;

public class Countdigits {
	
	static void digitCount(int num)
	{  int count=0;
		int digit=0;
		for(int i=1;num!=0;i++)
		{
			digit=num%10;
			count++;
			num=num/10;
		}
		System.out.println("Totall Digits : "+count);
	}

	public static void main(String[] args) {
      Scanner  s=new Scanner (System.in);
      System.out.println("Enter a number : ");
        int num =s.nextInt();  
        digitCount(num);
	}

}
