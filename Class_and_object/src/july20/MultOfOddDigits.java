package july20;


import java.util.Scanner;

public class MultOfOddDigits {
private static final char Y = 0;

public static void main(String[] args) {
	int num,mult=1,mult1=1;
	char ch;
	
	do{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	num=s.nextInt();
	while(num!=0)
	{
		int r =(num%10);
	
	
		{if(r%2!=0)
		mult=mult*r;
		
		else
			mult1=mult1*r;
		}
		num=num/10;
		
	}
	System.out.println("mult of odd number : "+mult);
	System.out.println("mult of Even number : "+mult1);

	 
	  System.out.println("To continue Enter Y/N ");
	  ch=s.next().charAt(0);
	}	while( ch=='Y'||  ch=='y');
		
}

}
