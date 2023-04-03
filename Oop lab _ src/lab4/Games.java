package lab4;

public class Games {
	public static void main(String args[]){
    Cricket_Player cp = new Cricket_Player("Cricket","Virat",31,100,2,10023,70);
    Football_Player fp = new Football_Player("Football","Messi",32,300,20,103,2);
    Hockey_Player hp = new Hockey_Player("Hockey","Manpreet",22,3,2,10,4);
    cp.show();
   fp.show();
    hp.show();
	}
}
