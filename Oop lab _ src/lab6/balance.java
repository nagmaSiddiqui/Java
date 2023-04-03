package lab6;
import balance.account;
public class balance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//balance_l6_q2.Account a= new balance_l6_q2.Account();//fully qualified naming
		account a = new account();//by importing the package
		a.read();
		a.Display_Balance();
	}
}
