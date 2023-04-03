package lab4;

public class Office {
	public static void main(String args[])
	{
	Manager m = new Manager("Shyam", 15, 5000);  //parameterised constructor
	                  //name/ emp_id/ salary
	m.show();
	m.increase_salary(50);
	
	Manager m2= new Manager();// default constructor
	}

}
