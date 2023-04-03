package lab4;

public class Worker {
	String name;
	int empno;
	Worker(int no,String n)//CONSTRUCTUR when we create object then it calls
	{ empno=no; name=n; }
	void compay()
	{
	System.out.println("\n--------------------------");
	System.out.println("Employee number : "+empno);
	System.out.println("Employee name : "+name);
	}
	void type()
	{
		System.out.println("This is a worker");
		}

}
