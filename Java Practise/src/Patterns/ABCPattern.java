package Patterns;

public class ABCPattern {

	public static void main(String[] args) {

		for(char i= 'A';i<='F';i++)
		{
			for(char j='F';j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		 
	}

}
