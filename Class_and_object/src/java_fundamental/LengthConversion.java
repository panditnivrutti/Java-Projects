package java_fundamental;

import java.util.Scanner;

public class LengthConversion {
public static void main(String[] args) {

			int cm;
			float m,km;
			System.out.println("Enter Length in cm ");
			Scanner s=new Scanner(System.in);
			cm=s.nextInt();
			m=cm/100;
			km=m/1000;
			
	System.out.println(cm+" cm = "+m+" meter");

	System.out.println(cm+" cm = "+km+" kelometers");			
			
				
}
}
