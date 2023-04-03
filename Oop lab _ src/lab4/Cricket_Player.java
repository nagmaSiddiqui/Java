package lab4;

public class Cricket_Player extends Player{
	int runs;
    int centuries;

    public Cricket_Player(String t, String n, int a, int nom, int rank, int r, int cent) {
        super(t, n, a, nom, rank);
        runs = r;
        centuries = cent;
    }

    public void show()
    {
    	System.out.println("\n--------------------------");
    	super.show();
        System.out.println("Total Runs: "+runs);
        System.out.println("No of Centuries: "+centuries);	       
    }

}
