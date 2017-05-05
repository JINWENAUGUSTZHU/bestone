package Day11;
/**
 * @author August Zhu
 *
 */
class hassistant extends Thread {
	public void sell() {
		if (ham.production == 0) {
			System.out.println("营业员：顾客朋友们，请稍微等一下，汉堡没了！");
		}
		try {
			ham.box.wait();
		} catch (Exception e) {
		}
		ham.sales++;
		System.out.println("营业员：顾客好，汉堡上来了，（总共卖了" + ham.sales + "个）");
	}

	public void run() {
		while (ham.sales < ham.production) {
			try {
				sleep(1000);
			} catch (Exception e) {
			}
			sell();
		}
	}
}

public class thread13 {
	public static void main(String[] agrs) {
		hmaker maker = new hmaker();
		hassistant assistant = new hassistant();
		maker.setName("甲");
		maker.start();
		assistant.start();
	}
}