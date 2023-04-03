package lab4;

public class Urgent extends TrunkCall{
	int z;
	Urgent(String name,int min,int r)
	{
	super(name,min);
	z=r;
	
	}
	void show()
	{
	super.show();
	System.out.println("Call Rate: "+z+" Rs/min");
	System.out.println("Total Cost: "+y*z);
	}

}
