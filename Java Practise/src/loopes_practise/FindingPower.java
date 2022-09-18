package loopes_practise;

import java.util.Scanner;

public class FindingPower {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
int num=s.nextInt();

System.out.println("Enter its index : ");
int index=s.nextInt();
  int power=1;
for(int i=1;i<=index;i++)
{
     power =power*num;	
}
System.out.println(power);

	
	}

}
