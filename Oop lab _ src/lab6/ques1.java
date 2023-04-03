package lab6;
import java.util.Scanner;
import balance.account;
public class ques1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		account acc = new account();
		acc.read();
		System.out.println("Give the Name of Bank: ");
		String bnk= sc.next();
		acc.Display_Balance();
		System.out.println("Name of bank: "+ bnk);

	}

}
