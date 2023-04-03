package lab10;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("Pineapple");
        list.add("mango");
        list.add("grapes");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for(String str: list){
            System.out.println(str);
        }

		
	}

}
