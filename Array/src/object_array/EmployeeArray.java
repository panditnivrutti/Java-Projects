package object_array;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeArray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=s.nextInt();
		Employee emp[]=new Employee[size];
      
      for (int i=0;i<size;i++)
      {
    	  System.out.println("Enter Name, Id ,dept,Salary");
    	  String name =s.next();
    	  int id =s.nextInt();
    	  String dept=s.next();
    	  int salary=s.nextInt();
    	  emp[i]=new Employee(name,id,dept,salary);
    	  
      }
    System.out.println(Arrays.toString(emp));  
	}

}
