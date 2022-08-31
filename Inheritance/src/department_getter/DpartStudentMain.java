package department_getter;

public class DpartStudentMain {

	public static void main(String[] args) {
                 
         Student s1=new Student();
            s1.setName("Vijay");
            s1.setId(12);
            s1.setMarks(95);
            
        Student s2=new Student();    
            s2.setName("Ajay");
            s2.setId(13);
            s2.setMarks(99);
            
            
        Student s3=new Student();        
            s3.setName("Digvijay");
            s3.setId(14);
            s3.setMarks(96);
            
        Student s4=new Student();       
            s4.setName("Sanjay");
            s4.setId(15);
            s4.setMarks(97);
            
           
        Student s5=new Student();      
            s5.setName("Amol");
            s5.setId(16);
            s5.setMarks(100);
            
            
            
        Department d1=new Department();
          d1.setName("Mechanical");
          d1.setId(1);
          d1.setHod("mr.Patel Sir");
          d1.setNos(65);
          d1.setS(s1);
          
          Department d2=new Department();
          d2.setName("Electrical");
          d2.setId(2);
          d2.setHod("mr.Thorat Sir");
          d2.setNos(60);
          d2.setS(s2);
          
          
          Department d3=new Department();
          d3.setName("Civil");
          d3.setId(3);
          d3.setHod("mr.Lokhande Sir");
          d3.setNos(62);
          d3.setS(s3);
          
          
          Department d4=new Department();
          d4.setName("Computor");
          d4.setId(4);
          d4.setHod("mr.Daya Sir");
          d4.setNos(66);
          d4.setS(s4);
 
          
          Department d5=new Department();
          d5.setName("Agriculture");
          d5.setId(5);
          d5.setHod("mr.Solunke Sir");
          d5.setNos(67);
          d5.setS(s5);
 
                System.out.println();
                System.out.println();
            System.out.println("Department name : "+d1.name+ " Head of Departmenrt : "+d1.hod+ " Student name : "+d1.s.name+" marks : "+d1.s.marks);
                 System.out.println();
            System.out.println("Department name : "+d2.name+ " Head of Departmenrt : "+d2.hod+ " Student name : "+d2.s.name+" marks : "+d2.s.marks);
                 System.out.println();
            System.out.println("Department name : "+d3.name+ " Head of Departmenrt : "+d3.hod+ " Student name : "+d3.s.name+" marks : "+d3.s.marks);
                 System.out.println();
            System.out.println("Department name : "+d4.name+ " Head of Departmenrt : "+d4.hod+ " Student name : "+d4.s.name+" marks : "+d4.s.marks);
                 System.out.println();
            System.out.println("Department name : "+d5.name+ " Head of Departmenrt : "+d5.hod+ " Student name : "+d5.s.name+" marks : "+d5.s.marks);
            
}

}
