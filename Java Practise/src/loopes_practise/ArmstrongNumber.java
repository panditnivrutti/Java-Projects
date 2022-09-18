package loopes_practise;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
  Scanner s=new Scanner (System.in);
  System.out.println("ENter a number :");
  int num=s.nextInt();
  int count =0;
  int  num1=num;
     for(int i=1;num1!=0;i++)
     {
    	 int digit=num1%10;
    	 count++;
    	 num1=num1/10;
     }
    
     num1=num; 
   
    int sum=0;
     for(int i =1;num1!=0;i++)
     {  int prd=1;
    	int digit=num1%10;
    	for( i=1;i<=count;i++)
    	{   
    		 prd=prd*digit;
    	}
    	sum=sum+prd;
    	num1=num1/10;
     }
     
     if (sum==num)
     {
    	 System.out.println(num+ " : Armstrong");
     }
     else
     {
    	 System.out.println(num+ " : Not Armstrong");
     }
 
	}

}
