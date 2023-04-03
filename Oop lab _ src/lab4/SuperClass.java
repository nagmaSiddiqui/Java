package lab4;

public class SuperClass {

	
		private int pvt = 10;
		public int pub = 20;
		protected int prt = 30;
		int def = 40;
	
		
		public int getPvt() {
			return pvt;
		}
		public int setPvt(int pvt) {
			
			this.pvt = pvt;
			return this.pvt;
		}
		public static void main(String[]args) {
			SuperClass sp = new SuperClass();
			System.out.println(sp.pvt);
		}

	}


