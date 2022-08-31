package saturday_test;

import java.util.Scanner;

public class Pattern {
	void starPattern(int limit,int i,int j)
	{
		for(i=1;i<=limit;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void alphaNumeric(int limit,int i,int j)
	{
		for(i=1;i<=limit;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2!=0)
				System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit : ");
		int limit=s.nextInt();
		Pattern p=new Pattern();
		p.starPattern(limit, 1,1);
		p.alphaNumeric(limit, 1, 1);
	}
}
