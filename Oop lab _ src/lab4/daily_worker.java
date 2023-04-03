package lab4;

public class daily_worker extends Worker {
	int rate;
	daily_worker(int no,String name,int r)
	{
	super(no,name);
	rate=r;
	}
	void compay(int h)
	{
	super.compay();
	System.out.println("Salary : "+rate*h);
	System.out.println("This is a daily worker");//no necessary/no need
	}

}
