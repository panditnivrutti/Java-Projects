package july27;

import java.util.Scanner;

public class NumPattern3 {

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
					   System.out.print(j);
				     }   
				     for(j=j-2;j!=0;j--)
				     {
					   System.out.print(j);
				     }
				 System.out.println();
			    }    
   }
   }
