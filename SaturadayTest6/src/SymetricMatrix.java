import java.util.Scanner;

public class SymetricMatrix {
	boolean symetric;
	void check(int array[][])
	{ 
		System.out.println("Given Matrix : ");
		for(int i=0;i<3;i++)
	       {
			   for(int j=0;j<3;j++)
			   {
				  System.out.print(array[i][j]+"   ");  
			   }
	           System.out.println();
	       }
		
		int transpose[][]=new int [3][3];
		  for(int i=0;i<3;i++)
	       {
			   for(int j=0;j<3;j++)
			   {
				   transpose [j][i]=array[i][j];
			   }
	          
	       }

			System.out.println("Transpose  Matrix : ");
			for(int i=0;i<3;i++)
		       {
				   for(int j=0;j<3;j++)
				   {
					  System.out.print(transpose[i][j]+"   ");  
				   }
		           System.out.println();
		       }
		   int check=0;
		  for(int i=0;i<3;i++)
	       {
			   for(int j=0;j<3;j++)
			   {
                  if  (transpose [i][j]==array[i][j])
                  {
                	
                     symetric=true;
                  }
               }  
	       }
		
		  if (symetric ==true)
			  System.out.println("Given matrix is Symetrical ");
		  else 
			  System.out.println("given matrix is not symetrical");
		  
	}
	
	
	

	public static void main(String[] args) {
       Scanner s=new Scanner (System.in);
       int array[][]=new int[3][3];
       
       
       System.out.println("Enter array elements : ");
       {
    	   for(int i=0;i<3;i++)
    		   for(int j=0;j<3;j++)
    		   {
    			   array[i][j]=s.nextInt();   
    		   }
       }
       SymetricMatrix sy=new SymetricMatrix ();
       sy.check(array);
	}
	}


