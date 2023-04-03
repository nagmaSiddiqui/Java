package lab10;
import java.util.ArrayList;
import java.util.Iterator;

public class ArraayListByUsingIterator {

	public static void main(String[] args) {
		ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("1st");
        arrl.add("2nd");
        arrl.add("3rd");
        arrl.add("Anything");
        Iterator<String> itr = arrl.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

		
	}

}
