package Day14;

/**
 * @author August Zhu
 *String是引用类型，是比较特殊的类，是只读对象。对String有任何改变，都将返回一个新的对象。
 */
public class second {
	public static void change(String str) {
		str = "abc";
	}

	public static void main(String[] args) {
		String str = "123";
		change(str);
		System.out.println(str);
	}

}
