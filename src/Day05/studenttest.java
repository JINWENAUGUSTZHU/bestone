package Day05;

/**
 * @author August Zhu
 *
 */
class studentclass {
	String name;
	String goal;
	String sexy;
	double achievement;

	public void set(String name, String goal, String sexy) {
		this.name = name;
		this.goal = goal;
		this.sexy = sexy;
	}

	public void set(double achievement) {
		this.achievement = achievement;
	}

	public String getname() {
		return name;
	}

	public String getgoal() {
		return goal;
	}

	public String getsexy() {
		return sexy;

	}

	public double getachi() {
		return achievement;

	}

	public String toString() {
		return goal;

	}

}

class studentmen extends studentclass {
	private String duty;

	public void set(String duty) {
		this.duty = duty;
	}

	public String getduty() {
		return duty;
	}

	public String toString() {
		return duty;

	}
}

public class studenttest {
	public static void main(String[] agrs) {
		studentclass sc = new studentclass();
		studentmen sm = new studentmen();
		studentmen sc1 = new studentmen();
		sc.set("С��", "1", "��");
		sc.set(90.5);
		sm.set("С��", "2", "��");
		sm.set(99.0);
		sm.set("�೤");
		System.out.println(sc.toString());
		System.out.println(sm.toString());
		sc1.set("С��", "3", "Ů");
		sc1.set(100.0);
		sc1.set("�W��ί�T");
		System.out.println(sc1.toString());

	}
}
	
