package lab10;
import java.util.HashMap;
public class HashMapKeySearch {

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("1st", "FIRST INSERTED");
        hm.put("2nd", "SECOND INSERTED");
        hm.put("3rd","THIRD INSERTED");
        System.out.println(hm);
        if(hm.containsKey("1st")){
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if(hm.containsKey("5th")){
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }

		

	}

}
