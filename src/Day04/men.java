package Day04;

/**
 * @author August Zhu
 *
 */
class Person1 {
	int a;

	Person1() {
		a = 10;
		System.out.println("this is father class constructor!");
	}

}
public class men extends Person1{
	int b;
	men()
	{
		b=20;
		System.out.println("This is son class constructor！");
		
	}
	public static void main(String[] args){
		men m=new men();
		System.out.println("从父类继承的a为"+m.a+"从父类继承的b为"+m.b);
		
	}
}


