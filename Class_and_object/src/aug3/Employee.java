package aug3;

import java.util.Scanner;

public class Employee {
	int id,salary,bsalary,bonus;
	String name,dept;
	char rating;

	void setData(int i,int sa,String n,String d,char r)
{
	name=n;
    dept=d;
	rating =r;
	id=i;
	salary=sa;
	
	
}
	void bonusCal()
	{  
		if (rating=='a')
		{
			
			bonus=20;
			bsalary=salary+(salary*20/100);
       	}
	  else if (rating=='b')
		{
		    bonus=15;
			bsalary=salary+(salary*15/100);
		}
	  else if (rating=='c')
		{
		    bonus=10;
			bsalary=salary+(salary*10/100);
		}
	  else 
	  {
		  bonus=0;
		  bsalary=salary;
	  }
	 
	}
	void display()
	{
		System.out.println("Employee Name : "+name);
		System.out.println("Employee ID : "+id);
		System.out.println("Employee Department : "+dept);
		System.out.println("Employee Salary : "+salary);
		System.out.println("Employee Rating : "+rating);
		System.out.println("Bonus : "+bonus+"%");
		System.out.println("Bonus Salary : "+bsalary);
		System.out.println("________________");
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Employee e1=new Employee();
		System.out.println("Enter employee name : ");
		String n=s.next();
		System.out.println("Enter employee Department : ");
		String d=s.next();
		System.out.println("Enter employee ID : ");
		int i=s.nextInt();
		System.out.println("Enter employee Salary : ");
		int sa=s.nextInt();
		System.out.println("Enter employee Rating : ");
	     char r = s.next().charAt(0);
	    e1.setData(i, sa, n, d, r);
		e1.bonusCal();   
		e1.display();
		System.out.println("________________");
		
		Employee e2=new Employee();
		System.out.println("Enter employee name : ");
		 n=s.next();
		System.out.println("Enter employee Department : ");
		 d=s.next();
		System.out.println("Enter employee ID : ");
		 i=s.nextInt();
		System.out.println("Enter employee Salary : ");
	     sa=s.nextInt();
		System.out.println("Enter employee Rating : ");
		 r = s.next().charAt(0);
	    e2.bonusCal(); 
		e2.setData(i, sa, n, d, r);
		
		e1.display();
		e2.display();
		
		
	}

}

