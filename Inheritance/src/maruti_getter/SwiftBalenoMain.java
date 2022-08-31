package maruti_getter;

public class SwiftBalenoMain {

	public static void main(String[] args) {
       Baleno b=new Baleno();
       b.setColour("Red");
       b.setName("Baleno");
       b.setPrice(700000);
       b.setEngg("4 Hp");
       b.setModelno("b55");
       b.setGroundclear(170);
       
       Swift s=new Swift();
       s.setColour("Red");
       s.setName("Baleno");
       s.setPrice(700000);
       s.setEngg("4 Hp");
       s.setModelno("b55");
       s.setGroundclear(170);
       
       System.out.println("Colour : "+b.getColour()+"\nName"+b.getName()+"Price"+b.getPrice()+"\nEngg Capacity"+b.getEngg());
	}

}
