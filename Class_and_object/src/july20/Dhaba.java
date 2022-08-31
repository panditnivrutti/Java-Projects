package july20;

import java.util.Scanner;

public class Dhaba {

	public static void main(String[] args) {
		int  qty, totall; char ch1;
	do{	
    Scanner s=new Scanner (System.in);
    System.out.println("1 : Rajasthani Thali - 150 RS");
    System.out.println("2 : Punjabi Thali - 200 RS");
    System.out.println("3 : Bahubali Thali - 250 RS");
    System.out.println("4 : Special Nonveg Thali - 300 RS");
    System.out.println("Please Enter Your Choice :");
    int ch=s.nextInt();
    
	switch(ch)
	{ case 1: System.out.println(" please Enter quantity");
	           qty=s.nextInt();  
	           totall=qty*150;
	           System.out.println("Totall : "+totall+" Rs");
	               break;
	  case 2: System.out.println(" please Enter quantity");
               qty=s.nextInt();  
               totall=qty*200;
               System.out.println("Totall : "+totall+" Rs");
                   break;
	  case 3: System.out.println(" please Enter quantity");
               qty=s.nextInt();  
               totall=qty*250;
               System.out.println("Totall : "+totall+" Rs");
                    break;
	  case 4: System.out.println(" please Enter quantity");
              qty=s.nextInt();  
              totall=qty*300;
              System.out.println("Totall : "+totall+" Rs");
	                break;
	  default:System.out.println("Invalid choice");
	}
	System.out.println("Do you want to order anything else  Y/N");
	 ch1=s.next().charAt(0);
	}
	while(ch1=='y' || ch1=='Y');
	}

}
