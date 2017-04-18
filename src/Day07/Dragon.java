package Day07;//申明了Dragon类的文件Dragon.java在Day07包下

/**
 * 这是一个龙的类
 * 
 * @author August Zhu
 *
 */
public class Dragon {
	/**
	 * 所有的龍都具有name這個特征，name的類型 文本（String:字符串）
	 */
	String name;
	/**
	 * 所有的龍都有年齡age這個特征
	 */
	int age;

	/**
	 * 方法，方法名是attack
	 */
	public void attack() {
		// 這個方法要執行的代碼
		//在方法中可以使用本類定義的屬性
		System.out.println(name+"在攻擊...");
	}
	
	/**
	 * 介紹自己
	 */
	public void introduceMyself(){
		System.out.println("大家好，我的名字叫"+name+",今年"+age+"歲。");
//		if(age>2500){
//			System.out.println("我是金丹境界");
//		}else{
//				System.out.println("我是元嬰境界");
//			}
		if(age<500){
			System.out.println("我是金丹境界");
		}else if(age>=500&&age<1000){
			System.out.println("我是元嬰境界");
		}else{
			System.out.println("我是元嬰境界");
		}
		}
	}

