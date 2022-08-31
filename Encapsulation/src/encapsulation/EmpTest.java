package encapsulation;

import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter employee name : ");
    String name=s.next();
    
    System.out.println("Enter id : ");
    int id =s.nextInt();
    
    System.out.println("Enter dept :");
    String dept=s.next();
    
    System.out.println("enter salary :");
    int salary=s.nextInt();
    
    System.out.println("Enter contact Details : ");
    String contact=s.next();
		Employee e1=new Employee();
		e1.setName(name);
		e1.setId(id);
		e1.setDept(dept);
		e1.setSalary(salary);
		e1.setContact(contact);
		e1.getName();
		e1.getId();
		e1.getDept();
		e1.getSalary();
		e1.getContact();
		System.out.println("Employee name : "+e1.getName()+"\nid : "+e1.getId()+"\nDepartment : "+e1.getDept()+"\nSalary : "+e1.getSalary()+"\nContact : "+e1.getContact());
	}

}
