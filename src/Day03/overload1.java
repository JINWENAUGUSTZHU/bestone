package Day03;

/**
 * @author August Zhu
 *
 */
public class overload1 {
	void print()
	{
		System.out.println("���");
	}
	void print(String name)
	{
		System.out.println(name+"�����");
	}
	void print(String name,int age)
	{
		System.out.println(name+"����ã�����"+age+"����");
	}
	public static void main (String args[])
	{
		overload1 o=new overload1();
		o.print();
		o.print("����");
		o.print("����",30);
		
		
	}

}
