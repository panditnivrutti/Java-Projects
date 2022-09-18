package loopes_practise;

public class PrimeNumbers {

	public static void main(String[] args) {
		int limit=300;
		int j;
		for(int i=400;i>limit;i--)
		{
			for( j=2;j<i;j++)
			{
				if (i%j==0)
					break;
			}
				if(i==j)
				{
					System.out.print(i+" ");
				}
			}
		}
		
	

}
