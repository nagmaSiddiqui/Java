package Practice;

public class Str_Meth {

	public static void main(String[] args) {
		String Name="Nagma";
		int Value=Name.length();
		System.out.println(Value);
		
		String name=Name.toLowerCase();
		System.out.println(name);
		
		String Uname= name.toUpperCase();
		System.out.println(Uname);
		
		String st= "      Na      ";
		String nst= st.trim();
		System.out.println(nst);
		
		System.out.println(Name.substring(2));

	}

}
