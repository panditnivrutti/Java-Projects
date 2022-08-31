package saturday_test;

import java.util.Scanner;

public class ReverseNumber {
	void reverse(int i,int num,int digit, int rev)
	{
		for(i=1;num!=0;i++)
		{
			digit=num%10;
		   rev=rev*10+digit;
		   num=num/10;
		}
		System.out.println(rev);
	}
	public static void main(String[] args) {
		ReverseNumber r=new ReverseNumber();
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter a number");
         int num=s.nextInt();
         r.reverse(1, num, 0, 0);
      
    		  
	}

}
