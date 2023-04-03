package lab4;

public class Manager extends Employee {
	String department="Technical";
	Manager(String name,int emp_id, int salary)
	{
		super(name,emp_id,salary);
	}
		void show() 
		{
			super.show();
			System.out.println("Department: "+ department);
			System.out.println("This is a Manager");//no need
		}

	Manager(){
		super.show();
		System.out.println("This is also a manager");
		System.out.println("Defautlt constructor Created");
		}

}
