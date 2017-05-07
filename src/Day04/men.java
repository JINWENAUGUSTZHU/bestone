package Day04;

/**
 * @author August Zhu
 *         创建类对象时，系统会调用构造器对其所属成员进行初始化，也就是在创建子类对象时，先执行父类的构造器。然后执行子类的构造器，
 *         最后完成对象的创建。 创建子类对象时，会先调用父类构造器，初始化继承自父类的成员，随后，调用子类构造器初始化子类的成员。
 */
class Person1 {
	int a;

	Person1() // 父类的构造器
	{
		a = 10;
		System.out.println("this is father class constructor!");
	}

}

public class men extends Person1 {
	int b;

	men() // 子类的构造器
	{
		// super() //隐藏的
		b = 20;
		System.out.println("This is son class constructor！");

	}

	public static void main(String[] args) {
		men m = new men();
		System.out.println("从父类继承的a为" + m.a + "从父类继承的b为" + m.b);

	}
}
