package lab4;

public class Money {
	public static void main(String args[])
	{
	daily_worker d=new daily_worker(25,"Shyam",75);
	                            //worker_no, name, rate_per_hour
	salaried_worker s=new salaried_worker(24,"Pawan",100);
	                            //worker_no, name, rate_per_hour
	d.compay(45);
	s.compay(43);

	}

}
