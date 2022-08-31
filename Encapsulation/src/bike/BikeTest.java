package bike;

import java.util.Scanner;

public class BikeTest {

	public static void main(String[] args) {
     Bike b1=new Bike();
     Scanner s=new Scanner(System.in);
     System.out.println("Enter bike name : ");
     String name=s.next();
     
     System.out.println("Enter bike id : ");
      int  id=s.nextInt();
      
      System.out.println("Enter Engine : ");
      String engine=s.next();
      
      System.out.println("Enter Colour : ");
      String color=s.next();
      
      
      
      System.out.println("Enter bike Price : ");
       int  price=s.nextInt();
       
       
       System.out.println("Enter installments : ");
        int  installments=s.nextInt();
        int dprice=0;
        
        b1.setName(name);
        b1.SetId(id);
        b1.setEngine(engine);
        b1.setColor(color);
        b1.SetPrice(price);
        b1.SetInsallment(installments);
       
        
        System.out.println("Name : "+b1.getName()+"\nId : "+b1.getId()+ "\nEngine : " +b1.getEngine()+"\nColour : " +b1.getColor()+"\nPrice : " +b1.getPrice() + "\nInstallment :"+ b1.getInstallments()+ "\nDiscounted Price");
        b1.dprice();
	}

}
