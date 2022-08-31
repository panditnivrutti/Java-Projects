package july27;

import java.util.Scanner;

public class PiramidNum {

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
					    	 if(j%2!=0)
					    	 System.out.print(1+" ");
					    	 else
					    		 System.out.print(0+" ");
					     }
							System.out.println();
				       	 }	 
									
						}
                        }
					
									
					
	