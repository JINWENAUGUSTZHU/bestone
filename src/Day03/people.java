package Day03;

import java.util.Scanner;

/**
 * @author August Zhu
 *
 */
public class people {
	static Scanner input = new Scanner(System.in);
	private String name;
	private String sex;
	private int age;
	private double weight;

	public people(String jname, String jsex, int jage, double jweight) {
		name = jname;
		sex = jsex;
		age = jage;
		weight = jweight;
	}

	public String eat(String food) {
		return "我在吃" + food;
	}

	void print(String a) {
		System.out.println(a);
	}

	public void game() {
		System.out.println("我在打游戏");
	}

	public static void main(String[] args) {
		people people = new people("李明", "男", 21, 65);
		System.out.println("姓名：" + people.name);
		System.out.println("性別：" + people.sex);
		System.out.println("年齡：" + people.age);
		System.out.println("體重：" + people.weight);
		people.game();
		String food = "可口的米饭";
		people.print(people.eat(food));
	}
}