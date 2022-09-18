package Patterns;

public class ReversePattern {
public static void main(String[] args) {
	
	int j;
	for(int i=5;i!=0;i--)
	{
		System.out.print("*");
		for( j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		for(int k=j-2;k!=0;k--)
		{
			System.out.print(k);
		}
		System.out.println("*");
	}
	System.out.println(" *");
}
}
