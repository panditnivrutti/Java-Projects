package aug02;

import java.util.Scanner;

public class EmployeeDetails {
	String name,dept;
	int id,salary;
	long contact;
	void setData(String n,String d,int i,int sa,long c)
	{
		name=n; dept=d; id=i; salary=sa; contact=c;
	}
	void display()
	{
		System.out.println("Name of Employee : "+name);
		System.out.println("ID : "+id);
		System.out.println("Department : "+dept);
		System.out.println("Salary: "+salary);
		System.out.println("Contact No. : "+contact);
		System.out.println("____________________________");
		System.out.println();
		
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	 EmployeeDetails e1=new EmployeeDetails();
	System.out.println("Enter Employee Name");
	System.out.println("Id");
	System.out.println("Department");
	System.out.println("Salary");
	System.out.println("Contact No.");
	String n=s.next();
	int i=s.nextInt();
	String d=s.next();
	int sa=s.nextInt();
	long c=s.nextInt();
	e1.setData(n, d, i, sa, c);
	System.out.println("_________________________");
	
	 EmployeeDetails e2=new EmployeeDetails();
		System.out.println("Enter Employee Name");
		System.out.println("Id");
		System.out.println("Department");
		System.out.println("Salary");
		System.out.println("Contact No.");
	          n=s.next();
	          i=s.nextInt();
	          d=s.next();
		      sa=s.nextInt();
	          c=s.nextInt();
		  e2.setData(n, d, i, sa, c);
		  
		  EmployeeDetails e3=new EmployeeDetails();
			System.out.println("Enter Employee Name");
			System.out.println("Id");
			System.out.println("Department");
			System.out.println("Salary");
			System.out.println("Contact No.");
		          n=s.next();
		          i=s.nextInt();
		          d=s.next();
			      sa=s.nextInt();
		          c=s.nextInt();
			  e3.setData(n, d, i, sa, c);
			  
			  EmployeeDetails e4=new EmployeeDetails();
				System.out.println("Enter Employee Name");
				System.out.println("Id");
				System.out.println("Department");
				System.out.println("Salary");
				System.out.println("Contact No.");
			          n=s.next();
			          i=s.nextInt();
			          d=s.next();
				      sa=s.nextInt();
			          c=s.nextInt();
				  e4.setData(n, d, i, sa, c);
				  

				  EmployeeDetails e5=new EmployeeDetails();
					System.out.println("Enter Employee Name");
					System.out.println("Id");
					System.out.println("Department");
					System.out.println("Salary");
					System.out.println("Contact No.");
				          n=s.next();
				          i=s.nextInt();
				          d=s.next();
					      sa=s.nextInt();
				          c=s.nextInt();
					  e5.setData(n, d, i, sa, c);
				e1.display();
				e2.display();
				e3.display();
				e4.display();
				e5.display();
			
}
}
