package Day11;

import java.util.Scanner;

/**
 * @author August Zhu
 *
 */
public class task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = 0;// һ����������32λ���������Ա��ķ�Χ�ڡ�
		int wei = 32;// 32λ�ļ����
		String result = null;// �ַ���
		System.out.println("������������һ��������");
		number = sc.nextInt();// ����

		result = Integer.toBinaryString(number);// Returns a string
												// representation of the integer
												// argument as an unsigned
												// integer in base 2.

		if (number != 0) {// һ��������������뱻���Ϊһ��32λ�Ķ�������ʱ���ڵ�һ��1֮ǰ��0��������
			System.out.println(wei - result.length());
		} else {
			System.out.println(wei);
		}
	}
}
