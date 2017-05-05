package Day11;

/**
 * @author August Zhu
 *
 */
public class ham {
	static Object box = new Object();
	static int totalmaterial = 10;
	static int sales = 0;
	static int production = 5;
}

/**
 * @author August Zhu
 *
 */
class hmaker extends Thread {
	public void make() {
		synchronized (ham.box) {
			(ham.production)++;
			try {
				ham.box.notify();
			} catch (Exception e) {
			}

		}
	}

	public void run() {
		while (ham.production < ham.totalmaterial) {
			if (ham.production > 0) {
				System.out.println("厨师" + getName() + ":" + "汉堡来了（总共" + (ham.production - ham.sales) + "个）");
			}
			try {
				sleep(3000);
			} catch (Exception e) {
			}
			make();
		}
	}
}
