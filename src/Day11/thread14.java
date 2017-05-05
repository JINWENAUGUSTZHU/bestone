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
			System.out.println("��ʦ" + getName() + ":" + "�������ˣ��ܹ���" + (ham.production - ham.sales1 - ham.sales2) + "����");
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
			System.out.println("ӪҵԱ" + getName() + ":�˿������ǣ�����΢��һ�£�����û�ˣ�");
			ham.sales1 = 0;
			ham.production = 0;
			try {
				ham.box.wait();
			} catch (Exception e) {
			}
		}
		(ham.sales1)++;
		System.out.println("ӪҵԱ" + getName() + ":�˿ͺã����������ˣ����ܹ�����" + ham.sales1 + "����");
	}

	public void sell2() {
		if (ham.production == (ham.sales1 + ham.sales2)) {
			System.out.println("ӪҵԱ" + getName() + ":�˿������ǣ�����΢��һ�£�����û�ˣ�");
			ham.sales2 = 0;
			ham.production = 0;
			try {
				ham.box.wait();
			} catch (Exception e) {
			}
		}
		(ham.sales2)++;
		System.out.println("ӪҵԱ" + getName() + ":�˿ͺã��������ˣ����ܹ�����" + ham.sales2 + "����");
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
		assistant1.setName("��");
		assistant2.setName("��");
		maker.setName("��");
		maker.start();
		assistant1.start();
		assistant2.start();
	}
}
