package Day14;

/**
 * @author August Zhu
 *
 */
public class Testpass {
	public void add(int x) {
		x++;
		System.out.println("add()方法：x=" + x);
	}

	public static void main(String[] args) {
		Testpass pass = new Testpass();
		int x = 100;
		pass.add(x);
		System.out.println("main()方法：x=" + x);
	}
}
