package mobilegetter;

public class Mobile {
  String name;
  int id,price;
   Battery bt;
   
   
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
	   return id ;
   }
   
   
   public void setPrice(int price)
   {
	   this.price=price;
   }
   
  public int getPrice()
  {
	  return price;
  }
  
  
  public void setBt(Battery bt) {
		this.bt=bt;
	}
	public Battery getBt() {
		return bt;
	}
 
}
