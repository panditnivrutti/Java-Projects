package saturday_tests3;

import java.util.Scanner;

 class Employee {
String name;
int id,salary;
 Employee()                     //default constructor              
{
		name="Nivrutti";
		id= 123;
		salary=35000;
}

Employee(String name,int id,int salary)           //parameterised constructor
{
		this.name=name;
		this.id= id;
		this.salary=salary;
}
void display()
{
	System.out.println("Employee Name : "+name);
	System.out.println("Employee id : "+id);
	System.out.println("Salary : "+salary+ " Rs");
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
       Employee e1=new Employee();
  
     System.out.println("For Parametarised Constructor");
     System.out.println("Enter Employee name : ");  
     String name =s.next();
    
     System.out.println("Enter Employee id : ");  
     int id  =s.nextInt();
     System.out.println("Enter Salary : ");  
     int salary  =s.nextInt();
     Employee e2=new Employee (name, id, salary);
     System.out.println("Default Constructor");
     e1.display();
     System.out.println("_______________________________");
     System.out.println("Parametarised Constructor");
     e2.display();
   
  
	}

}
