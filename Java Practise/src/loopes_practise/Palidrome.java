package loopes_practise;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a number : ");
  int num=s.nextInt();
  int num1=num;
  int rev=0;
  for(int i=1;num1!=0;i++)
  {
	  int digit=num1%10;
	   rev=rev*10+digit;
	   num1=num1/10;
  }
 
  if (num==rev)
  {
	  System.out.println(num+ " : Palidrome ");
  }
  else 
  {
	  System.out.println(num+ " : Not Palidrome ");
  }
	}

}
