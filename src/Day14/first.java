package Day14;

/**
 * @author August Zhu �ַ�����һ���Ƚ�����Ķ���
 *         �ַ���֮�������⣬����Ϊjava����������ΪString���͵Ķ��󿪱�һ���ռ䣬���ǽ������ء� �ַ������󴴽�֮��ᱻ���뵽�����С�
 *         ������һ���ص㣬���Ƕ�����ͬ�Ķ��󣬳���ֻ�洢һ�ݡ� str1��str2���ذ����ǿ���һ���������Գ���ֻ�洢һ�ݣ�ֻ�����������ö���
 *         ����StringֻҪ��new �ؼ���new������String,���ǵ�����һ������
 *         ����==�����������Ƚ϶�����ڴ��ַ������ֻҪ��==�����Ƚ�string,ֻҪ�����Լ����Լ����ǿ϶���false��
 *         ��String�е�equals�����Ѿ����˴������ǱȽ����ݣ�����Ҫ�Ƚ�string�����ݵĶ����ǵ�ַ��ʱ�򣬾�������
 *         equals()��������Object���ж���ģ�JAVA API�е��඼Ĭ���и÷�����Ĭ��������ǱȽ�������������ַ������
 *         �ܶ����������˸��ǡ�String��ͽ�equals���������˸��ǣ��޸�Ϊ�Ƚ������ַ������ַ����У�ֻҪ�ַ�������ͬ���ַ�����
 *         ����ֵ��Ϊtrue��
 *         nullָ��ָ�룬�����ַ���ָ����str�Ѿ�����ʼ��������ֵΪ�գ���������
 *         ���жϵ�ʱ��һ�����ж����ǲ��ǿ�ָ�룬�ٵ���equals�ж����ַ������Ƿ�Ϊ�գ�����ᷢ����ָ���쳣��
 */
public class first {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		if (str1!=null&&str1.equals("")) {
			System.out.println("�ַ����ǿմ�");
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
