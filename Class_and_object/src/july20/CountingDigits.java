package july20;

import java.util.Scanner;

public class CountingDigits {

	public static void main(String[] args) {
		char ch;
do
{
Scanner s=new Scanner(System.in);
System.out.println("Enter any number");
int num=s.nextInt();
int cnt = 0;
int r;

while(num!=0)
{
	r=num%10;
	cnt++;
	num=num/10;

}
System.out.println("Totall Digits in Number is :"+cnt);
System.out.println("Do you want to Continue  Y/N");
ch=s.next().charAt(0);
}while (ch=='Y' || ch=='y');
	}
}
