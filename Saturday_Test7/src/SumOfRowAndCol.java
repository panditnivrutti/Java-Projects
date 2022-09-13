import java.util.Scanner;

public class SumOfRowAndCol {
	
	void sumOfRows(int arr[][],int row,int col)
	{
		
		for(int i=0;i<row;i++)
		{  int sumrow=0;
		    for(int j=0;j<col;j++)
		    {
		    	 sumrow=sumrow+arr[i][j];
		    }
		    System.out.println("Sum of " + (i+1) +" row: " + sumrow);    
	    }    
     }
	void sumOfCol(int arr[][],int row,int col)
	{
		
		for(int i=0;i<col;i++)
			
		{   int sumCol=0;
		    for(int j=0;j<row;j++)
		    {
		    	 sumCol=sumCol+arr[j][i];
		    }
		    System.out.println("Sum of " + (i+1) +" Column : " + sumCol);    
	    }    
     }
		
	

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter size of row : ");
		int row=s.nextInt();
		
		System.out.println("Enter size of column : ");
		int col=s.nextInt();
		
		int arr[][]=new int [row][col];
		System.out.println("Enter array elements : ");
		for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		     arr[i][j]=s.nextInt();
		    }
		}
       System.out.println("Given array : ");
       for(int i=0;i<row;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		    System.out.print(arr[i][j]+"  ");
		    }
		    System.out.println();
		}
       SumOfRowAndCol sum=new SumOfRowAndCol ();
       sum.sumOfRows(arr, row, col);
       sum.sumOfCol(arr, row, col);
       
       
	}

}
