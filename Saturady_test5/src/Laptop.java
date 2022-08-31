
public class Laptop {
	
private	int noOfUSBPort,processorSpeed;
	
public void setNoOfUSBPort(int noOfUSBPort)
{
  this.noOfUSBPort=noOfUSBPort;	
}

public int getNoOfUSBPort()
{
  return noOfUSBPort;	
}

public void setProcessorSpeed(int processorSpeed)
{
   this.processorSpeed=processorSpeed;
}

public int getProcessorSpeed()
{
  return processorSpeed;	
}
public static void main(String[] args) {
	

Laptop l=new Laptop();
l.setNoOfUSBPort(4);
l.setProcessorSpeed(2);
System.out.println("USB port : "+l.getNoOfUSBPort()+" \nProcessor Speed : "+l.getProcessorSpeed()+" GHz.");
}
}
