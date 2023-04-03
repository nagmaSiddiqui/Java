package lab3;

public class GreaterThan40AndlessThan250Divisibleby5 {

	public static void main(String[] args) {
    int sum=0;
    for (int i=41;i<250;i++) {
    	if(i%5==0) {
    		sum +=i;
    		
    	}
    }
    System.out.println("sum is="+sum);
	}

}
