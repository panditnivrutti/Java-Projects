package july26;

import java.util.Scanner;

public class PyramidPatternNum {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter no.of Rows");
int r=s.nextInt();
int i,j;
		for(i=1;i<=r;i++)
		{
		     for(j=1;j<=r-i;j++)
		     {
			   System.out.print(" ");
		     }   
		     for(j=1;j<=i;j++)
		     {
			   System.out.print("* ");
		     }	
		     System.out.println();
		}	
		for(i=r-1;i>0;i--)
		{
		     for(j=1;j<=r-i;j++)
		     {
			   System.out.print(" ");
		     }   
		     for(j=1;j<=i;j++)
		     {
			   System.out.print("* ");
		     }	
		     System.out.println();
		}	
}

}
