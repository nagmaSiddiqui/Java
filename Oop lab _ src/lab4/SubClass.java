package lab4;

public class SubClass extends SuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass sp= new SuperClass();
		
		//System.out.println(sp.pvt);
		System.out.println(sp.pub);
		System.out.println(sp.prt);
		System.out.println(sp.def);
		
		SubClass sb = new SubClass();
		System.out.println(sb.setPvt(27));
		System.out.println(sp.pub);
		System.out.println(sp.prt);
		System.out.println(sp.def);

	}

}
