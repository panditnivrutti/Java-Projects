package object_array;

public class Employee {
	int id,salary;
	String name,dept;
	Employee(String name,int id ,String dept,int salary)
	{
		this.name=name;
		this.id=id;
		this.dept=dept;
		this.salary=salary;
		
	}
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + ", dept=" + dept + "]";
	}
	
	

}
