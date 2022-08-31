package inheritance1;

public class CarDriverMain {

	public static void main(String[] args) {
   
		 Driver d1=new Driver(1,"Jayesh","987654321");
		 Driver d2=new Driver(2,"vighnesh","987654453");
		 Driver d3=new Driver(3,"ramesh","987654222");
		 
		 Car c1=new Car(12,"Swift","Maruti",d1);
		 Car c2=new Car(13," Swift Dezire","Maruti",d2);
		 Car c3=new Car(14,"Indica","Tata",d3);
		 
		 System.out.println(c1);
		 System.out.println();
		 
		 System.out.println(c2);
		 System.out.println();
		 
		 System.out.println(c3);
		 
	} 

}
