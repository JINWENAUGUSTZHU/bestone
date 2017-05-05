package Day10;

/**
 * @author August Zhu
 *
 */
public class thread2 {
	public static void main(String[] args) {
		compute t = new compute();
		compute1 t1 = new compute1();
		t.setPriority(10);
		t.setPriority(1);
		t.start();
		t1.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
	}
}

class compute extends Thread {
	int i = 0;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}

class compute1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("这个数字是：" + i);
		}
	}
}