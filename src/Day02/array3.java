package Day02;

/**
 * @author August Zhu
 *
 */
public class array3 {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 4, 5 };
		int[] b = new int[] { 2, 3, 4, 5, 6 };
		int[] c = new int[5];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] * b[i];
			System.out.println("c[" + i + "]=" + (a[i] * b[i]));
		}
		// for (int j=0;j<a.length; j++)
		// {
		// System.out.println("c["+j+"]="+(a[j]*b[j]));
		// }
		System.out.println("a����ĳ����ǣ�" + a.length);
		System.out.println("b����ĳ����ǣ�" + b.length);
		System.out.println("c����ĳ����ǣ�" + c.length);

	}

}
