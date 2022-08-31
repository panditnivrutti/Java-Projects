package july20;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
char ch;


System.out.println("Enter any Number");	
int num=s.nextInt();
int mid=num/2;
int i=2;

while(i<=num/2)
{
 if(num%i==0)

 break;	

 if(i>mid)
 {
	 System.out.println("Not prime number");
 }
 else
 {
	 System.out.println("Prime number");
 }
      i++;
}

}
}


