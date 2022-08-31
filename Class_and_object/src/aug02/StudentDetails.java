package aug02;

import java.util.Scanner;

public class StudentDetails {
	int id,marks;
	String name,dept; 
	void setData(String name ,int id,String dept,int marks)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.marks=marks;
	}
  void display()
  {
	  System.out.println("Name : "+name);
	  System.out.println("Id : "+id);
	  System.out.println("Dpartment : "+dept);
	  System.out.println("Marks : "+marks);
  }
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
	System.out.println("Enter Name,id,Department,Marks");
	String n=s.next();
	int i=s.nextInt();
	String d=s.next();
	int m=s.nextInt();
	
	StudentDetails s1=new StudentDetails();
	s1.setData(n, i, d, m);
	
	System.out.println("Enter Name,id,Department,Marks");
	 n=s.next();
	 i=s.nextInt();
     d=s.next();
      m=s.nextInt();
	StudentDetails s2=new StudentDetails();
	s2.setData(n, i, d, m);
	s1.display();
	System.out.println("----------------");
	s2.display();
	
	
	

	}

}
