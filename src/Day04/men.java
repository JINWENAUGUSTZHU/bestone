package Day04;

/**
 * @author August Zhu
 *         ���������ʱ��ϵͳ����ù���������������Ա���г�ʼ����Ҳ�����ڴ����������ʱ����ִ�и���Ĺ�������Ȼ��ִ������Ĺ�������
 *         �����ɶ���Ĵ����� �����������ʱ�����ȵ��ø��๹��������ʼ���̳��Ը���ĳ�Ա����󣬵������๹������ʼ������ĳ�Ա��
 */
class Person1 {
	int a;

	Person1() // ����Ĺ�����
	{
		a = 10;
		System.out.println("this is father class constructor!");
	}

}

public class men extends Person1 {
	int b;

	men() // ����Ĺ�����
	{
		// super() //���ص�
		b = 20;
		System.out.println("This is son class constructor��");

	}

	public static void main(String[] args) {
		men m = new men();
		System.out.println("�Ӹ���̳е�aΪ" + m.a + "�Ӹ���̳е�bΪ" + m.b);

	}
}
