package Day03;

import java.util.Scanner;

/**
 * @author August Zhu ���Ǹ�������Ⱥ�ѵ�demo
 * ������һ���ࡣgoods��Ȼ������new�������󡣷ֱ�ֵ��Ȼ��ִ�з���������ӡ������
 * 1122.3ʹ��###,###.###��ʽ�����ֺ�value:1,122.3
1122.34567ʹ��###,###.###��ʽ�����ֺ�value:1,122.346
111222.34567ʹ��###,###.###��ʽ�����ֺ�value:111,222.346
1.1111122234567E8ʹ��###,###.###��ʽ�����ֺ�value:111,111,222.346
1.0ʹ��000��ʽ�����ֺ�value:001
1.0ʹ��000000��ʽ�����ֺ�value:000001
1.0ʹ��000000.000��ʽ�����ֺ�value:000001.000
112222.345ʹ��###,###.###����ʽ�����ֺ�value:112,222.345��
1.111222234533E7ʹ��###,###.###����ʽ�����ֺ�value:11,112,222.345��
111222.345ʹ��000,000.000����ʽ�����ֺ�value:111,222.345��
111222.345ʹ��00,000,000.000����ʽ�����ֺ�value:00,111,222.345��
111222.345ʹ��00,000,000.00000����ʽ�����ֺ�value:00,111,222.34500��
0.12345678ʹ��##.###%��ʽ�����ֺ�value:12.346%
0.0345678ʹ��00.###%��ʽ�����ֺ�value:03.457%
0.345678ʹ��###.###���ʽ�����ֺ�value:345.678��
 */

class goods {
	String name;
	int price;
	int num;
	int sum;

	void print1() {

		System.out.println("������" + name + "��������");
	}

	void print2() {
		System.out.println("������Ҫ����" + name + "��������");
	}

	void sum() {
		sum = price * num;
	}

}

public class help1 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		double d = 8;
		goods a = new goods();
		a.name = "������";
		goods b = new goods();
		b.name = "����Ь";
		goods c = new goods();
		c.name = "T��  ";
		a.print1();
		a.price = input.nextInt();
		b.print1();
		b.price = input.nextInt();
		c.print1();
		c.price = input.nextInt();
		a.print2();
		a.num = input.nextInt();
		b.print2();
		b.num = input.nextInt();
		c.print2();
		c.num = input.nextInt();
		a.sum();
		b.sum();
		c.sum();
		System.out.println("****************�����嵥***************");
		System.out.println("��Ʒ" + "                     " + "�۸�" + "                     " + "����"
				+ "                     " + "���");
		System.out.println(a.name + "                     " + a.price + "      " + a.num + "        " + a.sum);
		System.out.println(b.name + "                     " + b.price + "      " + b.num + "        " + b.sum);
		System.out.println(c.name + "                        " + c.price + "      " + c.num + "        " + c.sum);
		System.out.println("**********************************");
		System.out.println("�ۿۣ�" + d + "��");
		double e = a.price*a.num + b.price*b.num + c.price*c.num;
		String f1 = new java.text.DecimalFormat("###,###.###").format(e);
		System.out.println("�����ܶ�Ϊ��" + f1);
		double f = d * 0.1 * e;
		String f2 = new java.text.DecimalFormat("###,###.0").format(f);
		System.out.println("ʵ��֧�����Ϊ��" + f2);

	}

}