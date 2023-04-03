package lab7;
class nonumeric extends Exception {

	nonumeric()
    {
        super("the value is non numeric \n");
    }
}
public class Q2 {
	public static void main(String ar[]) {
        int a, b, c = 0;
        System.out.println("Name : Khyati Singh | Sap : 500086189");
        try {
            a = Integer.parseInt(ar[0]);
            throw new nonumeric();
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (nonumeric e) {
            System.out.println(e);
        }
    }
	

}
