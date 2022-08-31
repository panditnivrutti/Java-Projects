package inheritance2;

public class CarDriverMain {

	public static void main(String[] args ) {
   
		
		 
		 
		
				Driver d1=new Driver();
				d1.setId(1);
				d1.setName("Yogesh");
				d1.setContact("9874563210");

				
				Car c1=new Car();
				c1.setId(1);
				c1.setName("Swift");
			c1.setComp("Maruti");
				c1.setD(d1);
				System.out.println(" Id : "+c1.id+" , car name : "+c1.name+" , Company : "+c1.comp+" , Driver name : "+d1.name+" , Driver id : "+d1.id+ " Contact no. "+d1.contact  );
		}
	}


