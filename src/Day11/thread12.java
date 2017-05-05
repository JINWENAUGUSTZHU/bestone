package Day11;

/**
 * @author August Zhu
 *
 */
public class thread12 {
	public static void main(String[] args) {
		compute7 t = new compute7();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();

	}

}

class compute7 extends Thread {
	int i = 10;
	static Object obj = new Object();

	synchronized void print() {
		System.out.println(Thread.currentThread().getName() + ":" + i);
		i--;
	}

	public void run() {
		while (i > 0) {
			print();
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}