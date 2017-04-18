package Day07;

/**
 * 這是一個測試類
 * 
 * @author August Zhu
 *
 */
public class Testd {
	/**
	 * main方法，作為程序運行的入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 創建一個龍類的對象g1，行注釋
		Dragon g1 = new Dragon();
		// 創建一個龍的對象g2
		Dragon g2 = new Dragon();
		Dragon g3= new Dragon();
		// 使用g1的屬性
		g1.name = "囚牛";// 將“囚牛”這個文本賦值給g1.name
		g1.age = 3000;
		g2.name = "睚眥";
		g2.age = 2300;
		g3.name="嘲諷";
		g3.age=1200;
		System.out.println("g1的名字是：" + g1.name + "，年齡是：" + g1.age);
		System.out.println("g2的名字是：" + g2.name + "，年齡是：" + g2.age);
        //g1攻擊，g2攻
		g1.attack();//g1調用自身的attack方法；
        g2.attack();//g2調用自身的attack方法；
        //g1介紹自己，g2介紹自己
        g1.introduceMyself();
        g2.introduceMyself();
        g3.introduceMyself();
	}
}
