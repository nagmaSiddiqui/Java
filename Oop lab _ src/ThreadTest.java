
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i="+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println("j="+j);
		}
	}
}

class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("k="+k);
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		new A().start();
		new B().start();
		new C().start();
		// TODO Auto-generated method stub

	}

}
