package dynamic_poly;

public class FamilyMain {

	public static void main(String[] args) {
     
		Father f=new Father();
		
		f.vehicle();
		f.house();
		f =new Son();   //upcasting
		f.vehicle();
		f.house();
		
		f=new Daughter();
		f.house();
		f.vehicle();
	}

}
