package Day11;

/**
 * @author August Zhu
 *
 */
class ham {
	static Object box = new Object();
	static int totalmaterial = 10;
	static int sales1 = 0;
	static int sales2 = 0;
	static int production = 5;
}

class hmaker extends Thread {
	public void make() {
		synchronized (ham.box) {
			(ham.production)++;
			System.out.println("厨师" + getName() + ":" + "汉堡来了（总共）" + (ham.production - ham.sales1 - ham.sales2) + "个）");
			try {
				ham.box.notify();
			} catch (Exception e) {
			}
		}
	}

	public void run() {
		while (ham.production < ham.totalmaterial) {
			make();
			try {
				sleep(3000);
			} catch (Exception e) {
			}
		}
	}
}

class hassistant extends Thread {
	public void sell1() {
		if (ham.production == (ham.sales1 + ham.sales2)) {
			System.out.println("营业员" + getName() + ":顾客朋友们，请稍微等一下，汉堡没了！");
			ham.sales1 = 0;
			ham.production = 0;
			try {
				ham.box.wait();
			} catch (Exception e) {
			}
		}
		(ham.sales1)++;
		System.out.println("营业员" + getName() + ":顾客好，汉堡上来了，（总共卖了" + ham.sales1 + "个）");
	}

	public void sell2() {
		if (ham.production == (ham.sales1 + ham.sales2)) {
			System.out.println("营业员" + getName() + ":顾客朋友们，请稍微等一下，汉堡没了！");
			ham.sales2 = 0;
			ham.production = 0;
			try {
				ham.box.wait();
			} catch (Exception e) {
			}
		}
		(ham.sales2)++;
		System.out.println("营业员" + getName() + ":顾客好，汉堡来了，（总共卖了" + ham.sales2 + "个）");
	}

	public void run() {
		while ((ham.sales1 + ham.sales2) < ham.production) {
			sell1();
			try {
				sleep(1000);
			} catch (Exception e) {
			}
		}
		while ((ham.sales1 + ham.sales2) < ham.production) {
			try {
				sleep(1000);
			} catch (Exception e) {
			}
			sell2();
		}
	}

}

public class thread14 {
	public static void main(String[] args) {
		hmaker maker = new hmaker();
		hassistant assistant1 = new hassistant();
		hassistant assistant2 = new hassistant();
		assistant1.setName("甲");
		assistant2.setName("乙");
		maker.setName("甲");
		maker.start();
		assistant1.start();
		assistant2.start();
	}
}
