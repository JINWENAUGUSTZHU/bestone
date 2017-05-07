package Day14;

/**
 * @author August Zhu 字符串是一个比较特殊的对象。
 *         字符串之所以特殊，是因为java会在内容中为String类型的对象开辟一个空间，我们叫他串池。 字符串对象创建之后会被放入到串池中。
 *         串池有一个特点，就是对于相同的对象，池中只存储一份。 str1和str2串池把他们看做一个对象，所以池中只存储一份，只是有两个引用而已
 *         对于String只要用new 关键字new出来的String,都是单独的一个对象。
 *         而“==”号是用来比较对象的内存地址，所以只要用==号来比较string,只要不是自己比自己，那肯定是false。
 *         而String中的equals方法已经做了处理，他是比较内容，所以要比较string的内容的而不是地址的时候，就用它！
 *         equals()方法是在Object类中定义的，JAVA API中的类都默认有该方法，默认情况下是比较两个对象的虚地址。但是
 *         很多类对其进行了覆盖。String类就将equals方法进行了覆盖，修改为比较两个字符串的字符序列，只要字符序列相同的字符串，
 *         返回值就为true。
 *         null指空指针，而空字符串指的是str已经被初始化，不过值为空，即“”。
 *         在判断的时候，一定先判断其是不是空指针，再调用equals判断其字符序列是否为空，否则会发生空指针异常。
 */
public class first {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if (str1!=null&&str1.equals("")) {
			System.out.println("字符串是空串");
		} else {
			System.out.println(str1);
		}

		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		System.out.println(str1 == str3);

		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
	}

}
