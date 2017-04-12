package Day03;

/**
 * @author August Zhu
 *首先java找到main函数入口，然后容器根据类Smm新建了一个对象a,因为类Smm是继承Sub,所以对象a会同时初始化两个参数，i,j为0,然后既然是继承。子类Smm要调用父类sub的方法，故父类先执行,i就被赋值为20，接着执行父类体内的方法print(),注意此时子类其实方法print()有重写，所以执行子类的方法print(j)，此时j为0，所以打印0，接着跳到父类，i被赋值为30，回到子类，j被赋值为30，然后程序执行到子类的print()方法。打印j,也就是30；接着在子类里j被赋值为40，然后主函数定义一个bb,把对象a的j参数赋值给bb,并且打印出bb,所以第三次打印的是40；程序结束。答案是0,30,40

 */
class sub {
	int i=20;
	
	sub(){
		print();
		i=30;
	}
	void print(){
		System.out.println(i);
	}
}
/**
 * @author August Zhu
 *
 */
public class Smm extends sub {
	int j=30;
	Smm(){
		print();
		j=40;
	}
	void print(){
		System.out.println(j);
	}
	public static void main(String[] args)
	{
		Smm a =new Smm();
		int bb=a.j;
		System.out.println(bb);
		
	}
}