package saturday_test;

import java.util.Scanner;

public class FiboSeries {
void fibo(int a,int b,int sum,int i,int limit)
{
      for(i=1;i<=limit;i++)
		  { 
			  System.out.println(sum);
			  a=b;
			  b=sum;
			  sum=a+b; 
		  }	
}
	public static void main(String[] args) {
    FiboSeries f=new FiboSeries();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter limit");
     int limit=s.nextInt();
     f.fibo(0, 1, 0, 1, limit);
	}

}
