package Day03;

/**
 * @author August Zhu
 *
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