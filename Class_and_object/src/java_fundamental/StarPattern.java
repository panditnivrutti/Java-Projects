package java_fundamental;

public class StarPattern {
	public static void main(String[] args) {
		int i;
		char j;
		

		 for(i=1; i<5; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
         {           
          
         for(j=1; j<=i; j++) //  inner loop for columns
         {       
             System.out.print(" * "
             		+ ""); // print star
         }           
         System.out.println(); // ending line after each row		
         }		
				
				
				
					
	
	
	
	
	
	
}
}
