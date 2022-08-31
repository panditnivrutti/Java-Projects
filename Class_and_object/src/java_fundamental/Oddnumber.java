package java_fundamental;
import java.util.Scanner;
public class Oddnumber {
	public static void main(String[] args) {
			Scanner s=new Scanner (System.in);
			System.out.println("Enter a limit");
			int limit=s.nextInt();
			int i=1;
			while(i<=limit)
			{
				if(i%2!=0)
				System.out.println(i+" ");
		        i++;		
			}
			System.out.println("Loop end");
		} 
		}


