import java.util.Scanner;

public class SumOfLowerTM {
	public void sumOfLowerTM(int array[][],int row,int col )
	{
		int sum=0;
		for(int i = 0; i < row ; i++)
		{
			for(int j = 0; j < col; j++)
			{
				if(i > j) 
				{
					sum = sum + array[i][j];
				}
			}
		}
		System.out.println(" The Sum of the Lower Triangle Matrix =  " + sum);
	}
	public void display(int row,int col,int array[][])
	{
		System.out.println("Given array : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(array[i][j]+ "    ");
			}
			System.out.println();
		}
		
	}
	

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("No.of rows : ");
			int row=s.nextInt();
			
			System.out.println("No.of columns : ");
			int col=s.nextInt();
			int array[][]=new int [row][col];
			System.out.println("Enter the array elements : ");
		
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
					array[i][j]=s.nextInt();
					}
				}
	    	
			SumOfLowerTM st=new SumOfLowerTM();
			st.display(row, col, array);
			
			st.sumOfLowerTM(array, row, col);
	}
	

}
