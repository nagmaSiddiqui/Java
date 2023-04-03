package lab4;

public class salaried_worker extends Worker{
	int rate;
	salaried_worker(int no,String name,int r)//constructure to get
	{
	super(no,name);
	rate=r;
	}
	void compay(int h)
	{
	h=40;
	super.compay();
	System.out.println("Salary : "+ rate*h);
	System.out.println("This is a salaried worker");
	}

}
