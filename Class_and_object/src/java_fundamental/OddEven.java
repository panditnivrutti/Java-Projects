package java_fundamental;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	int num;
	int even;
	System.out.println("Enter number");
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
    even=num%2;
    System.out.println("Press 1 to check " +num+ " is odd or even..");
    int num2=s.nextInt();
    switch(num2)
    {
    case 1:
    if(even==0)
    {
    	System.out.println("Given number is Even");
    }
    else 
    
    	System.out.println("Given number is odd");
    }
    
}
}
