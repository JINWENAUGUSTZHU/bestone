package Day03;

/**
 * @author August Zhu
 *
 */
public class overload1 {
	void print()
	{
		System.out.println("你好");
	}
	void print(String name)
	{
		System.out.println(name+"，你好");
	}
	void print(String name,int age)
	{
		System.out.println(name+"，你好，你有"+age+"岁了");
	}
	public static void main (String args[])
	{
		overload1 o=new overload1();
		o.print();
		o.print("王华");
		o.print("王华",30);
		
		
	}

}
