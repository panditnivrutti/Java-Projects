package department_getter;

public class Department {
 int id,nos;
 String name,hod;
 Student s;
 
 public void setName(String name)
 {
	 this.name=name;
	 
 }
 public String getName()
 {
	 return name;
 }
 
 
 
 
 public void setHod(String hod)
 {
	 this.hod=hod;
 }
 public String getHod()
 {
	 return hod;
 }
 
 
 
 
 public void setId(int id)
 {
	 this.id=id;
 }
 public int getId()
 {
	 return id;
 }
 
 
 
 
 public void setNos(int nos)
 {
	 this.nos=nos;
 }
 public int getNos()
 {
	 return nos;
 } 
 
 
 
 public void setS(Student s) {
		this.s=s;
	}
	public Student getS() {
		return s;
	}

}