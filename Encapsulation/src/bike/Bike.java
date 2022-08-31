package bike;

public class Bike {
	private int id,price,installments,dprice;
	private String name,engine,color;
	
	
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}

	
	
	
	public void SetId(int id)
	{
		this.id=id;
	}
	
	 public int getId()
	 {
		 return id;
	 }
	 
	 
	 
	 public void setEngine(String engine)
		{
			this.engine=engine;
		}
	 
		public String getEngine()
		{
			return engine;
		}
		
		
		
		 public void setColor(String color)
			{
				this.color=color;
			}
			public String getColor()
			{
				return color;
			}

			

			public void SetPrice(int price)
			{
				this.price=price;
			}
			
			 public int getPrice()
			 {
				 return price;
			 }
			 
			 
			 
			 public void SetInsallment(int installments)
				{
					this.installments=installments;
				}
				
				 public int getInstallments()
				 {
					
				  return installments;
				 }
				 
				 
				  void dprice()
				 {
	
					 if(installments==1)
					 {
						 dprice=price-price*20/100;
					 
					 System.out.println(dprice);
					 }
					
					 else if(installments==2)
					 {
						 dprice=price-price*10/100;
					 System.out.println(dprice);
					 } 
					 
					 else if(installments==3)
					 {
						 dprice=price-price*5/100;
					 System.out.println(dprice);
					 }  
				 }
				 
	
}
