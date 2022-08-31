package AddressProof;

public class IdProof extends Person {
	String name1,number,validity;
	
	public  void setData(String name,String number,String validity)
	{
		this.name1=name1;
		this.number=number;
		this.validity=validity;
	}
	
	public void Display()
	     {
		    if(idProof.equals("adhar")&& address.equals("pune"))
		    {
		    	super.Display();
		     System.out.println("Id Proof : "+idProof+"\nId No. : "+number+"\nValidity : "+validity);
		    }
		    else
		    {
		    	System.out.println("Sorry ,You are not from pune or you dont have adhar card ");
		    }
		    }
		     
	 }

