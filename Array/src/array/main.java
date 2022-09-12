package array;


	import java.util.Scanner;
	class Main {
		
		public static  boolean isPrime(int a[])
		{
	    //Do NOT CHANGE GIVEN CODE
			int count=0;
			boolean flag=false;
			//Write your Logic here
	    for(int i=0;i<a.length;i++)
	     {
	       for(int n=2;n<a[i];n++)
	     {
	         if(a[i]%n==0)
	         {
	           count++;
	         }
			if(count>0)
			{
				return false;
			}
			else
			{
				return true;
			}
	    }
	    }
		return flag;
		}

		public static void main(String[] args) {
			//DO NOT CHANGE GIVEN CODE
			int a[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter array elements : ");
			for(int i=0;i<a.length;i++)
			{
				 
	            a[i]=sc.nextInt();
	      //WRITE LOGIC FOR INPUT
			}
			
			for( int i=0;i<a.length;i++)
			{
				boolean isPrime = false;
				if(isPrime)
				{
	               System.out.println(a[i]);
					//WRITE LOGIC FOR DISPLAY OUPUT
	        
	       		}
			}
			
			

		}

	}

