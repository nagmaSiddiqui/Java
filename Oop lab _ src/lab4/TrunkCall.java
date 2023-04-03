package lab4;

public class TrunkCall {
	String x;//x=name
	int y;//time
	TrunkCall(String n,int time)//n=name
	{
		x=n; y=time;
		}
	void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Call Type: "+x);
	System.out.println("Time used: "+y);
	
	}

}  
