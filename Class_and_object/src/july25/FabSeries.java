package july25;

import java.util.Scanner;

public class FabSeries {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter a limit");
  int limit=s.nextInt();
  int a=0,b=1,i,sum=0;
  for(i=1;i<=limit;i++)
	  { 
		  System.out.println(sum);
		  a=b;
		  b=sum;
		  sum=a+b; 
	  }
		}
	}
