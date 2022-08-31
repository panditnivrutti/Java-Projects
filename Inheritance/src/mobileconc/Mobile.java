package mobileconc;

public class Mobile {
  String name;
  int id,price;
   Battery bt;
   
   Mobile(String name,int id,int price,Battery bt)
   {
	   this.name=name;
	   this.id=id;
	   this.price=price;
	   this.bt=bt;
   }
   
   
  public  String toString()
   {
	   return "Mobile name : "+name+ " Price : "+price+ " Battery : "+bt;
   }
}
