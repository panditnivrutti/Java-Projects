package aug04.constructor;

import java.util.Scanner;

public class Person {
	String name,contact,address,email;
	int id,age;
	Person(String n,String c,String a,String e,int i,int ag)
	{
		name=n;
		contact=c;
		address=a;
		email=e;
		id=i;
		age=ag;
	}
	void display()
	{
		System.out.println("Person name : "+name);
		System.out.println("Person id : "+id);
		System.out.println("Age : "+age);
		System.out.println("Adress : "+address);
		System.out.println("Contact no. : "+contact);
		System.out.println("Email : "+email);
		
		
	}
	
	

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter Person name" );
          String n=s.next();
          
		System.out.println("Enter Person id" );
		    int i=s.nextInt();
		    
		System.out.println("Enter Age : ");
	    	int ag=s.nextInt();
		
		System.out.println("Enter Adress :");
		String a=s.next();
		
		System.out.println("Enter Contact no. : ");
		String c=s.next();
		
		System.out.println("Enter Email : ");
		String e=s.next();
	}

}
