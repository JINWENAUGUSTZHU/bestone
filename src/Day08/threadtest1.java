package Day08;

/**
 * @author August Zhu
 *
 */
public class threadtest1 {
public static void main(String [] args){
	compute3 t=new compute3();
	compute4 t1=new compute4();
	t.start();
	t1.start();
	
}
}
class compute3 extends Thread {
	int i=1;
	public void run(){
		for(int i=0; i<10;i++){
			System.out.print(i);
		}
	}
}
class compute4 extends Thread{
	public void run(){
	for (int i=0;i<10;i++){
		System.out.println("这个数字是："+i);
	}
}
}
