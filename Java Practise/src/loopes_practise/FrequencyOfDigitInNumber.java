package loopes_practise;

import java.util.Scanner;

public class FrequencyOfDigitInNumber {

	public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.println("Enter number of multiple numbers : ");
int num=s.nextInt();

for (int i=1;i<=9;i++)
{   int num1=num;
	int freq=0;
			 for(;num1!=0;)
			 {
				 int digit =num1%10;
				 if(digit==i)
				 {freq++;}
				 num1=num1/10;
			 }
		 if(freq>0)
		 {
		 System.out.println(i+" : "+freq);
		 }
}



	}

}
