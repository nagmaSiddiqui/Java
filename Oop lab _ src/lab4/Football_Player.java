package lab4;

public class Football_Player extends Player{
	int goals;
    int fouls;

    public Football_Player(String t,String n, int a, int nom, int rank, int g, int foul) {
        super(t, n, a, nom, rank);
        goals = g;
        fouls = foul;       
    }

    public void show()
    {
    	System.out.println("\n--------------------------");
    	super.show();
        System.out.println("Total Goals: "+goals);
        System.out.println("No of faul "+fouls);       
    }

}
