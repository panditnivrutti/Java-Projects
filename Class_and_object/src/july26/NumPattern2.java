package july26;

import java.util.Scanner;

public class NumPattern2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no.of rows");
	int r=s.nextInt();
	int i,j;
	for(i=1;i<=r;i++)
	{
	     for(j=1;j<=i;j++)
	     {
	    	 System.out.print(j);
	    	 
	     }
	System.out.println();

	}
}
}
