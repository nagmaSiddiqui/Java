package lab4;

public class Employee {
	String n;
	int id;
	int pay;
	Employee(String name,int emp_id, int salary)//parameterised constructor
	{
		n=name; id=emp_id;pay=salary;
		}
	void increase_salary(int x)
	{
		pay = pay+ ((x*pay)/100);
		System.out.println("The increased salary is : "+pay);
	}
	Employee(){}//default constructor
	void show()
	{
	System.out.println("\n--------------------------");
	System.out.println("Name of Employee: "+n);
	System.out.println("Employee id: "+id);
	System.out.println("Salary of Employee: "+pay);
	
	}

}
