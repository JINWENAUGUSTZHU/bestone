package Day02;

/**
 * @author August Zhu
 *
 */
public class overload {
	void test()
	{
		System.out.println("No parameters");
	}
	void test(int a)
	{
		System.out.println("a:"+a);
	}
	void test(int a ,int b)
	{
		System.out.println("a and b:"+a+""+b);
	}
	double test (double a)
	{
		System.out.println("double a:"+a);
		return a*a;
	}
	public static void main (String args[])
	{
		overload o =new overload ();
		o.test();
		o.test(2);
		o.test(2,3);
		o.test(2.0);
		
	}

}
