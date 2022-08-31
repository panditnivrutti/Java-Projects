package department_getter;

public class Student {
    int id,marks;
    String name;
    
    
    public void setName(String name)
    {
    	this.name=name;
    }
    public String getName()
    {
    	return name;
    }
    
    
    public void setId(int id)
    {
    	this.id=id;
    }
    public int getId()
    {
    	return id;
    }
    
    
    public void setMarks(int marks)
    {
    	this.marks=marks;
    }
    public int getMarks()
    {
    	return marks;
    }
}