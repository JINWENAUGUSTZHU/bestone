package Day11;

/**
 * @author August Zhu
 *
 */
public class factor1 {
	public static void sum(int a, int b) {
		int i;
		int sum = 0;
		for (i = 0; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "到" + b + "的和是" + sum);
	}

	public static int factor(int i) {
		if (i == 1)
			return i;
		return i * factor(i - 1);
	}

	public static void main(String[] args) {
		int k = factor(3);
		System.out.println(k);
	}
}
