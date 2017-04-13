package Day03;

import java.util.Scanner;

/**
 * @author August Zhu 这是个给柠檬群友的demo
 */

class goods {
	String name;
	int price;
	int num;
	int sum;

	void print1() {

		System.out.println("请输入" + name + "的数量：");
	}

	void print2() {
		System.out.println("请输入要购买" + name + "的数量：");
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
		a.name = "网球拍";
		goods b = new goods();
		b.name = "网球鞋";
		goods c = new goods();
		c.name = "T恤  ";
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
		System.out.println("****************消费清单***************");
		System.out.println("物品" + "                     " + "价格" + "                     " + "个数"
				+ "                     " + "金额");
		System.out.println(a.name + "                     " + a.price + "      " + a.num + "        " + a.sum);
		System.out.println(b.name + "                     " + b.price + "      " + b.num + "        " + b.sum);
		System.out.println(c.name + "                        " + c.price + "      " + c.num + "        " + c.sum);
		System.out.println("**********************************");
		System.out.println("折扣：" + d + "折");
		double e = a.price + b.price + c.price;
		String f1 = new java.text.DecimalFormat("#").format(e);
		System.out.println("消费总额为：" + f1);
		double f = d * 0.1 * (a.price + b.price + c.price);
		String f2 = new java.text.DecimalFormat("#.0").format(f);
		System.out.println("实际支付金额为：" + f2);

	}

}