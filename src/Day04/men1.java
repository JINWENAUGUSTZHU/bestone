package Day04;

/**
 * @author August Zhu
 *
 */
class Person {
	int a;

	Person() {
		a = 1;
	}

	Person(int a) {
		this.a = a;
	}
}
public class men1 extends Person
{
	int b;
	men1(int a ,int b)
	{
		super(a);
		this.b=b;
	}	
	public static void main (String [] args)
	{
		men1 m=new men1(10,20);
		System.out.println(m.a+""+m.b);
	}
}
