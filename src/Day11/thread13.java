package Day11;
/**
 * @author August Zhu
 *
 */
class hassistant extends Thread {
	public void sell() {
		if (ham.production == 0) {
			System.out.println("ӪҵԱ���˿������ǣ�����΢��һ�£�����û�ˣ�");
		}
		try {
			ham.box.wait();
		} catch (Exception e) {
		}
		ham.sales++;
		System.out.println("ӪҵԱ���˿ͺã����������ˣ����ܹ�����" + ham.sales + "����");
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
		maker.setName("��");
		maker.start();
		assistant.start();
	}
}