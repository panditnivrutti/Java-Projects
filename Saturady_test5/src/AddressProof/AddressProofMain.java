package AddressProof;

import java.util.Scanner;

public class AddressProofMain {

	public static void main(String[] args) {
      IdProof i=new IdProof();
      Scanner s=new  Scanner(System.in);
      System.out.println("Enter your name ");
      String name=s.next();
      
      System.out.println("Enter your id ");
      int id=s.nextInt();
      
      System.out.println("Enter your Contact ");
      String contact=s.next();
      
      System.out.println("Enter your address ");
      String address=s.next();
      
      System.out.println("Enter your idprof ");
      String idProof=s.next();
      
      System.out.println("Enter your Id number ");
      String number=s.next();
      
      System.out.println("Enter your name ");
      String name1=s.next();
      
      System.out.println("Enter  Validity ");
      String validity=s.next();
      
      
     i.setPData(name, id,contact , address, idProof);
    
      i.setData(name1, number,validity);
    
      i.Display();
	}

}
