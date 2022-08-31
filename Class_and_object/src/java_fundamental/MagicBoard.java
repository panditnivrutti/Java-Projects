package java_fundamental;

import java.util.Scanner;

public class MagicBoard {
public static void main(String[] args) {
   char ch1 = 0;
   char ch2 = 0;
   char ch3 = 0;
   char ch4 = 0;
	System.out.println("Enter any four numbers");
	Scanner s=new Scanner(System.in);
	int num1=s.nextInt();
	int num2=s.nextInt();
	int num3=s.nextInt();
	int num4=s.nextInt();
	        ch1=(char)num1;
			 System.out.println(num1+" - "+ch1);
			 ch2=(char)num2;
			 System.out.println(num2+" - "+ch2);
			 ch3=(char)num3;
			 System.out.println(num3+" - "+ch3);
			 ch4=(char)num4;
			 System.out.println(num4+" - "+ch4);

	
}
}
