package lab4;

public class Lightening extends TrunkCall{
	int z;
	Lightening(String name,int min,int r)// charge per min
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
