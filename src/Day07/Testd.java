package Day07;

/**
 * �@��һ���yԇ�
 * 
 * @author August Zhu
 *
 */
public class Testd {
	/**
	 * main��������������\�е����
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// ����һ����Č���g1����ע�
		Dragon g1 = new Dragon();
		// ����һ�����Č���g2
		Dragon g2 = new Dragon();
		Dragon g3= new Dragon();
		// ʹ��g1�Č���
		g1.name = "��ţ";// ������ţ���@���ı��xֵ�og1.name
		g1.age = 3000;
		g2.name = "���{";
		g2.age = 2300;
		g3.name="���S";
		g3.age=1200;
		System.out.println("g1�������ǣ�" + g1.name + "�����g�ǣ�" + g1.age);
		System.out.println("g2�������ǣ�" + g2.name + "�����g�ǣ�" + g2.age);
        //g1������g2��
		g1.attack();//g1�{�������attack������
        g2.attack();//g2�{�������attack������
        //g1��B�Լ���g2��B�Լ�
        g1.introduceMyself();
        g2.introduceMyself();
        g3.introduceMyself();
	}
}
