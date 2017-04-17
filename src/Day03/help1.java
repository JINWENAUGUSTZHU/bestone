package Day03;

import java.util.Scanner;

/**
 * @author August Zhu 这是个给柠檬群友的demo
 * 定义了一个类。goods。然后构造器new三个对象。分别赋值。然后执行方法。最后打印出来。
 * 1122.3使用###,###.###格式化数字后value:1,122.3
1122.34567使用###,###.###格式化数字后value:1,122.346
111222.34567使用###,###.###格式化数字后value:111,222.346
1.1111122234567E8使用###,###.###格式化数字后value:111,111,222.346
1.0使用000格式化数字后value:001
1.0使用000000格式化数字后value:000001
1.0使用000000.000格式化数字后value:000001.000
112222.345使用###,###.###￥格式化数字后value:112,222.345￥
1.111222234533E7使用###,###.###￥格式化数字后value:11,112,222.345￥
111222.345使用000,000.000￥格式化数字后value:111,222.345￥
111222.345使用00,000,000.000￥格式化数字后value:00,111,222.345￥
111222.345使用00,000,000.00000￥格式化数字后value:00,111,222.34500￥
0.12345678使用##.###%格式化数字后value:12.346%
0.0345678使用00.###%格式化数字后value:03.457%
0.345678使用###.###‰格式化数字后value:345.678‰
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
		double e = a.price*a.num + b.price*b.num + c.price*c.num;
		String f1 = new java.text.DecimalFormat("###,###.###").format(e);
		System.out.println("消费总额为：" + f1);
		double f = d * 0.1 * e;
		String f2 = new java.text.DecimalFormat("###,###.0").format(f);
		System.out.println("实际支付金额为：" + f2);

	}

}