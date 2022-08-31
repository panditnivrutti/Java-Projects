package java_fundamental;

import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number of wich you want to print a table");
  int num=s.nextInt();
  int i=1;
  while(i<=10)
  {
	  System.out.println(i*num);
	  i++;	  
  }
}
}
