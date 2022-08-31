package mobilegetter;

public class MobileBattMain {

	public static void main(String[] args) {
		
		
		
		
         Battery b1=new Battery();
          b1.setName("li-ion");
          b1.setId(1);
          b1.setCapacity("4100 mah");
          
         Battery b2=new Battery(); 
         b2.setName("li-ion");
         b2.setId(2);
         b2.setCapacity("4200 mah");
         
         Battery b3=new Battery();
         b3.setName("li-ion");
         b3.setId(3);
         b3.setCapacity("4500 mah");
         
         
         Battery b4=new Battery();
         b4.setName("li-ion");
         b4.setId(4);
         b4.setCapacity("5000 mah");
         
         
         Battery b5=new Battery();
         b5.setName("li-ion");
         b5.setId(5);
         b5.setCapacity("6000 mah");
         
         
         Mobile m1=new Mobile();
         m1.setName("Samsung");
         m1.setId(12);
         m1.setPrice(10000);
         m1.setBt(b1);
         
         Mobile m2=new Mobile(); 
         
         m2.setName("Motorola");
         m2.setId(13);
         m2.setPrice(15000);
         m2.setBt(b2);
         
         
       Mobile m3=new Mobile(); 
         m3.setName("Xiomi");
         m3.setId(14);
         m3.setPrice(20000);
         m3.setBt(b3);
         
         Mobile m4=new Mobile();   
         m4.setName("Oneplus");
         m4.setId(15);
         m4.setPrice(35000);
         m4.setBt(b4);
         
        Mobile m5=new Mobile();
         m5.setName("Apple");
         m5.setId(16);
         m5.setPrice(80000);
         m5.setBt(b5);
         
         System.out.println(" Brand name : "+m1.name+ "  , Price : " +m1.price+" , Battery id :  "+m1.bt.id +" , Battery name : " +m1.bt.name+ " , Capacity : "+m1.bt.capacity);
         System.out.println(" Brand name : "+m2.name+ "  , Price : " +m2.price+" , Battery id :  "+m2.bt.id +" , Battery name : " +m2.bt.name+ " , Capacity : "+m2.bt.capacity);
         System.out.println(" Brand name : "+m3.name+ "  , Price : " +m3.price+" , Battery id :  "+m3.bt.id +" , Battery name : " +m3.bt.name+ " , Capacity : "+m3.bt.capacity);
         System.out.println(" Brand name : "+m4.name+ "  , Price : " +m4.price+" , Battery id :  "+m4.bt.id +" , Battery name : " +m4.bt.name+ " , Capacity : "+m4.bt.capacity);
         System.out.println(" Brand name : "+m5.name+ "  , Price : " +m5.price+" , Battery id :  "+m5.bt.id +" , Battery name : " +m5.bt.name+ " , Capacity : "+m5.bt.capacity);
	}

}
