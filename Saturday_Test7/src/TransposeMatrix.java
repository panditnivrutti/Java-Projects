import java.util.Scanner;

public class TransposeMatrix {
	
	void Transpose(int array[][],int row,int col)
	{ 
		System.out.println("Given Matrix : ");
		for(int i=0;i<row;i++)
	       {
			   for(int j=0;j<col;j++)
			   {
				  System.out.print(array[i][j]+"   ");  
			   }
	           System.out.println();
	       }
		
		int transpose[][]=new int [row][col];
		  for(int i=0;i<row;i++)
	       {
			   for(int j=0;j<col;j++)
			   {
				   transpose [j][i]=array[i][j];
			   }
	          
	       }

			System.out.println("Transpose  Matrix : ");
			for(int i=0;i<row;i++)
		       {
				   for(int j=0;j<col;j++)
				   {
					  System.out.print(transpose[i][j]+"   ");  
				   }
		           System.out.println();
		        }	   
        	}
	public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       System.out.println("Enter Rows");
       int row=s.nextInt();
       
       System.out.println("Enter columns : ");
       int col=s.nextInt();
       
       int array[][]=new int[row][col];
       
       
       System.out.println("Enter array elements : ");
       {
    	   for(int i=0;i<row;i++)
    		   for(int j=0;j<col;j++)
    		   {
    			   array[i][j]=s.nextInt();   
    		   }
       }
       TransposeMatrix  tm=new TransposeMatrix  ();
          tm.Transpose(array,row,col);
	}
	}


