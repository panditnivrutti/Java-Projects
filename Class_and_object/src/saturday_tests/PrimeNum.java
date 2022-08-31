package saturday_tests;


public class PrimeNum {

	public static void main(String[] args) {
   
int i,j,start=400,end=300;
   for(i=start;i>=end;i--)
   {
	 for(j=2;j<i;j++)
	 {
		 if(i%j==0)
		 break;	 
	 }
	  if(i==j)
	  {
		  System.out.println(i);
	  }
   }
	}
}
