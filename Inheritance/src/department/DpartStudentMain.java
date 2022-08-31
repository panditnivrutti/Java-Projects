package department;

public class DpartStudentMain {

	public static void main(String[] args) {
            Student s1=new Student("vijay" ,12,95);
            Student s2=new Student("ajay" ,13,99);
            Student s3=new Student("Digvijay" ,12,96);
            Student s4=new Student("Sanjay" ,13,97);
            Student s5=new Student("Amol" ,15,100);
            
            Department d1=new Department("mechanical",1,"mr.Patel Sir",65,s1);
            Department d2=new Department("Electrical",2,"mr.Thorat Sir",60,s2);
            Department d3=new Department("Civil",3,"mr.Lokhande Sir",62,s3);
            Department d4=new Department("Computor",4,"mr.Daya Sir",64,s4);
            Department d5=new Department("agriculture",1,"mr.Solunke Sir",70,s5);
            
   
            
            
            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
            System.out.println(d4);
            System.out.println(d5);
}

}
