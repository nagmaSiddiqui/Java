package lab4;

public class Hockey_Player extends Player {
	int goals;
    int noyellocard;

    public Hockey_Player(String t,String n, int a, int nom, int rank, int g, int ycard) {
        super(t, n, a, nom, rank);
        goals = g;
        noyellocard = ycard;}
        
	 public void show()
	    {
			System.out.println("\n--------------------------");
			super.show();
	        System.out.println("Total Goals: "+goals);
	        System.out.println("No of yellow card: "+noyellocard);	       
	    }

}
