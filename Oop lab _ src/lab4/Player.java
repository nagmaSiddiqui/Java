package lab4;

public class Player {
	String name;
    int age;
    int no_matches;
    int ranking; 
    String type;
 
    Player(String t,String n, int a, int nom, int rank)
    {
        name = n;
        type=t;
        age = a;
        no_matches = nom;
        ranking = rank;
    } 
    
	public void show()
	{
	
    System.out.println("Sport: "+ type);
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("No of Mathces: "+no_matches);
    System.out.println("Rank: "+ranking);
	
	}

}
