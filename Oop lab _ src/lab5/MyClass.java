package lab5;

public class MyClass implements A {
	int s=0;
	int t=0;
	public int meth1(int c) {
		System.out.println("inside MyClass class - implemented method meth1");
		s=c*c*c;
		return s;}
	public int meth2(int d) {
		System.out.println("inside MyClass class - implemented method meth2");
		t=d*d;
		return t;}
	public static void main(String[] args) {
		int z = 0;
		int y = 0;
		A obj = new MyClass();
		z = obj. meth1(10);
		y= obj.meth2(20);
		System.out.println("The value of square = " + y);
		System.out.println("The value of cube = " + z);
	}

}
