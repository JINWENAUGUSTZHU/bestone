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
		return "���ڳ�" + food;
	}

	void print(String a) {
		System.out.println(a);
	}

	public void game() {
		System.out.println("���ڴ���Ϸ");
	}

	public static void main(String[] args) {
		people people = new people("����", "��", 21, 65);
		System.out.println("������" + people.name);
		System.out.println("�Ԅe��" + people.sex);
		System.out.println("���g��" + people.age);
		System.out.println("�w�أ�" + people.weight);
		people.game();
		String food = "�ɿڵ��׷�";
		people.print(people.eat(food));
	}
}