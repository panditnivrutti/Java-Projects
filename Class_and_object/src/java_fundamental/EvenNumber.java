package java_fundamental;
import java.util.Scanner;
public class EvenNumber {

	

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter a limit");
		int sum1=0;
		int sum=0;
		int limit=s.nextInt();
		int i=1;
		while(i<=limit)
		{
		   if(i%2==0)
			sum=sum+i;
		   
		   else 
			sum1=sum1+i;
	           i++;		
		}
		System.out.println("Sum of even number :"+sum);
		System.out.println("Sum of odd number :"+sum1);
	} 
	}


