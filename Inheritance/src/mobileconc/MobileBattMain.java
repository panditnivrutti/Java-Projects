package mobileconc;

public class MobileBattMain {

	public static void main(String[] args) {
         Battery b1=new Battery("li-ion",1,"4100 mah");
         Battery b2=new Battery("li-ion",2,"4200 mah");
         Battery b3=new Battery("li-ion",3,"4500 mah");
         Battery b4=new Battery("li-ion",4,"5000 mah"); 
         Battery b5=new Battery("li-ion",5,"6000 mah");
         
         
         Mobile m1=new Mobile("Samsung", 12,10000,b1);
         Mobile m2=new Mobile("Motorola", 13,15000,b2);
         Mobile m3=new Mobile("Xiomi", 14,20000,b3);
         Mobile m4=new Mobile("Oneplus", 15,35000,b4);
         Mobile m5=new Mobile("Apple", 16,80000,b5);
         System.out.println(m1);
         System.out.println(m2);
         System.out.println(m3);
         System.out.println(m4);
         System.out.println(m5);
	}

}
