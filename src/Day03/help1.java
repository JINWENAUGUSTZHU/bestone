package Day03;

import java.util.Scanner;

/**
 * @author August Zhu ���Ǹ�������Ⱥ�ѵ�demo
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
		double e = a.price + b.price + c.price;
		String f1 = new java.text.DecimalFormat("#").format(e);
		System.out.println("�����ܶ�Ϊ��" + f1);
		double f = d * 0.1 * (a.price + b.price + c.price);
		String f2 = new java.text.DecimalFormat("#.0").format(f);
		System.out.println("ʵ��֧�����Ϊ��" + f2);

	}

}