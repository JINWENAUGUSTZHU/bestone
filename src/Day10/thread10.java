package Day10;

/**
 * @author August Zhu
 *
 */
public class thread10 {

	public static void main(String[] args) {
		compute6 t = new compute6('a');
		compute6 t1 = new compute6('b');
		compute6 t2 = new compute6('c');
		t.start();
		t1.start();
		t2.start();
	}
}

class compute6 extends Thread {
	char ch;

	static Object obj = new Object();

	compute6(char ch) {
		this.ch = ch;
	}

	public void print(char ch) {
		for (int i = 1; i < 10; i++) {
			System.out.print(ch);
		}
	}

	public void run() {
		synchronized (obj) {
			for (int i = 1; i < 10; i++) {
				print(ch);
				System.out.println();
			}

		}
	}
}
