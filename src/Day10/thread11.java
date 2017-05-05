package Day10;

/**
 * @author August Zhu
 *
 */
public class thread11 {
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

	public void print() {
		System.out.println(Thread.currentThread().getName() + ";" + i);
		i--;
	}

	public void run() {
		while (i > 0) {
			synchronized (obj) {
				print();
			}
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
