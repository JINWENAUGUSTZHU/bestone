package Day04;

/**
 * @author August Zhu
 *
 */
class Person {
	int a;

	Person() {
		a = 10;
		System.out.println("this is father class constructor!");
	}

}
public class men extends Person{
	int b;
	men()
	{
		b=20;
		System.out.println("This is son class constructor��");
		
	}
	public static void main(String[] args){
		men m=new men();
		System.out.println("�Ӹ���̳е�aΪ"+m.a+"�Ӹ���̳е�bΪ"+m.b);
		
	}
}


