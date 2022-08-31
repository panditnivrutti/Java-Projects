package saturday_tests3;

public class CharPattern {
	
	int i,j;
	char k,l;
	void charPattern(char k,char l)
	{
		System.out.println("1 . Character Pattern");
		System.out.println();
		for(k='F';k!='A';k--)
		{
			for(l='A';l<=k;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}	
		for(k='A';k<='F';k++)
		{
			for(l='A';l<=k;l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}	
		System.out.println();
		System.out.println("____________________________________");
		
		
	}
void numPattern()
{
	System.out.println("2 . Number Pattern");
	System.out.println();

	  for (int i = 9; i >= 1; i--)
      {
           for (int j = 1; j <= i; j++)
          {
              System.out.print(" ");
          }

          for (int j = i; j <= 9; j++)          
          {
              System.out.print(j);
          }

          for (int j = 8; j >= i; j--)
          {               
              System.out.print(j);            
          }
           
          System.out.println();

          
      }
}

	public static void main(String[] args) {
       CharPattern c=new CharPattern();
       c.charPattern('F', 'A');
       c.numPattern();
	}

}
