package july22;

import java.util.Scanner;

public class SimpleForLoop {

	public static void main(String[] args) {
Scanner s=new Scanner (System.in);
System.out.println("Enter limit");
int limit=s.nextInt();
int i;
for(i=1;i<=limit;i++)
{
	System.out.println(i);

}
	System.out.println("Done");
	}

}
