package Patterns;

public class Pattern121 {

	public static void main(String[] args) {
        
		int j;
		System.out.println("*");
		for(int i=1;i<=5;i++)
		{  System.out.print("*");
		    for( j=1;j<=i;j++)
		    {
		    	System.out.print(j+" ");
		    }
		    for(int k=j-2;k!=0;k--)
		    {
		    	System.out.print(k+" ");
		    }
		    System.out.println("*");
		    
		}
	}

}
