package Day09;

/**
 * @author August Zhu
 *
 */
public class thread1 {
	public static   void main(String[] args) {
		teacher t = new teacher("����", "223331", "Ů", "Ӣ��");
		t.set("�Ϻ�ʦ��ѧԺ", "���꼶");
		Thread th = new Thread(t);
		student s = new student("�ſ�", "82212", "��", "�����");
		s.set("������ѧ", "����");
		Thread th1 = new Thread(s);
		th.start();
		th1.start();

	}
}
