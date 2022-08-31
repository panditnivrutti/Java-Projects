package july20;

import java.util.Scanner;

public class FindGreaterDigit {

	public static void main(String[] args) {
	
		
Scanner s=new Scanner (System.in);
int digit;
char ch;

do
{
System.out.println("Enter Any Number : ");
int num=s.nextInt();
int greater=num%10;
int minimum=num%10;
while(num!=0)
	
{  digit=num%10;
if(digit<minimum)
{
	minimum=digit;
	
}
if(digit>greater)
{
	greater=digit;
	
}
     num=num/10;
       
}
System.out.println("Greater digit is : "+greater); 
System.out.println("Minimum digit is : "+minimum); 
System.out.println("Do you want to Continue  Y/N");
ch=s.next().charAt(0);
}while (ch=='Y' || ch=='y');
}	
}
