package Day09;

/**
 * @author August Zhu
 *
 */
public class thread1 {
	public static   void main(String[] args) {
		teacher t = new teacher("董洁", "223331", "女", "英语");
		t.set("上海师范学院", "三年级");
		Thread th = new Thread(t);
		student s = new student("张俊", "82212", "男", "计算机");
		s.set("北京大学", "大四");
		Thread th1 = new Thread(s);
		th.start();
		th1.start();

	}
}
