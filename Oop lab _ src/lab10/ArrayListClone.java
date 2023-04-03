package lab10;
import java.util.ArrayList;
public class ArrayListClone {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        //adding elements to the end
        arrl.add("1st");
        arrl.add("2nd");
        arrl.add("3rd");
        arrl.add("Anything");
        System.out.println("Actual ArrayList:"+arrl);
        ArrayList<String> copy = (ArrayList<String>) arrl.clone();
        System.out.println("Cloned ArrayList:"+copy);

	

	}

}
