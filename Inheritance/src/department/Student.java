package department;

public class Student {
    int id,marks;
    String name;
    
    Student(String name,int id ,int marks)
    {
    	this.name=name;
    	this.id=id;
    	this.marks=marks;
    
    }
    
   public String toString()
    {
    	return " , Student name : " +name+ " , marks :" +marks;
    }
}
