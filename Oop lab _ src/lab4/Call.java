package lab4;

public class Call {
	public static void main(String args[])
	{
	Lightening l=new Lightening("lightening", 10, 15);
	Urgent u=new Urgent("urgent", 7, 10);
	Ordinary o= new Ordinary("ordinary", 30,5);
	                        //type / time used / rate per min
	l.show();
	u.show();
	o.show();
	}

}
