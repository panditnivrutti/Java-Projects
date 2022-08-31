package java_fundamental;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class LoopAddition {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a limit");
	 int limit=s.nextInt();
	 int sum = 0;
	 int i=1;
 while(i>=limit)
 {
	sum=sum+i; 
	i++;
 }
 System.out.println(sum);
}
}
