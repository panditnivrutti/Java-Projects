package java_fundamental;

import java.util.Scanner;

public class HighestNoOfPlacement {
public static void main(String[] args) {
	System.out.println("Enter the no of students placed in SCE:");
	Scanner s=new Scanner (System.in);
	int sce=s.nextInt();
	
	System.out.println("Enter the no of students placed in ECE:");
	int ece=s.nextInt();
	
	System.out.println("Enter the no of students placed in MECH:");
	int mech=s.nextInt();
	if (sce<0 || ece<0 || mech<0)
	{
		System.out.println("invalid input");
	}
	    else if ( sce == ece && sce ==  mech )
     	{
		System.out.println("None of the department has got the highest placement");

	    }
	    else if (sce > ece && sce>mech)
	    {
		    System.out.println("Highest Placement");
	        System.out.println("SCE");
	    }
		else if (ece > sce && ece>mech)
		{
			System.out.println("Highest Placement");
		    System.out.println("ECE");
		}
		else if (mech>ece&&mech>sce)
		{
			System.out.println("Highest Placement");
		    System.out.println("MECH");
		}
		else if (mech==ece&&ece>sce)
		{
			System.out.println("Highest Placement");
		    System.out.println("MECH");
		    System.out.println("ECE");
		}
		else if (sce==ece&&ece>mech)
		{
			System.out.println("Highest Placement");
		    System.out.println("SCE");
		    System.out.println("ECE");
		}
		else if (sce==mech&&sce>ece)
		{
			System.out.println("Highest Placement");
		    System.out.println("SCE");
		    System.out.println("MECH");
		}	
}    
	
}
