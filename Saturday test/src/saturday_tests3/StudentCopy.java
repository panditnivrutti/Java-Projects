package saturday_tests3;

import java.util.Scanner;

public class StudentCopy {
	
             int id;
	         String name;
	         String dept;
  StudentCopy(String name,int id,String dept){
	         
	         this.id = id;
	         this.name = name;
	         this.dept = dept;
	    }

	     
          StudentCopy(StudentCopy obj){
        	  this.name = obj.name;
	          this.id = obj.id;
	          this.dept = obj.dept;
	     }
		void display()
		{
			System.out.println("Student Name : "+name);
			System.out.println("Student id : "+id);
			System.out.println("Department : "+dept);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.print("Enter Student Id:");
			int id = sc.nextInt();
			System.out.println("Enter Department:");
			String dept = sc.next();
			
			StudentCopy obj1 = new StudentCopy(name,id,dept);
			System.out.println("*** Student 1 ***");
			System.out.println();
			obj1.display();
			
			StudentCopy obj2=obj1;
			System.out.println();
			System.out.println("***Student 2***");
			System.out.println();
			obj2.display();
			
		}


}
