package Practice;

public class Repacing {

	public static void main(String[] args) {
		String letter = "Dear <|name|>, Thanks a lot for being so good!";
        letter = letter.replace("<|name|>", "Nagma");
        System.out.println(letter);
	}

}
