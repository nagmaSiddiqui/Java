package Practice;

public class Operators {

	public static void main(String[] args) {
		System.out.println(64>41);
		System.out.println(64>23 && 41>10);
		System.out.println(64>11 ||64>98);
		System.out.println(5&7);
		int a=5*2-4/2;
		int x=1;
		int y=3;
		int c=(x-y)/2;
		
	
		System.out.println(a);
		System.out.println(c);
		
		int g= 10;
		System.out.println(g++);
		System.out.println(g);
		
		int r=5;
		System.out.println(++r);
		
		int u=7;
		int v= ++u*8;
		System.out.println(v);
		
		float f= 7/4.0f * 9/4.0f;
		System.out.println(f);
		
		char grade='B';
		 grade= (char)(grade+8);
		System.out.println(grade);
		
		grade=(char)(grade-8);
		System.out.println(grade);

	}

}
