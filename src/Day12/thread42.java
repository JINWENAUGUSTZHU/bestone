package Day12;

/**
 * @author August Zhu
 *
 */
public class thread42 {
	public static void main(String[] agrs) {
		flower f1 = new flower();
		flower f2 = new flower();
		flower f3 = new flower();
		f1.setname("ĵ��");
		f1.setcolor("��ɫ");
		f1.setlocation("����");
		f2.setname("ĵ��");
		f2.setcolor("��ɫ");
		f2.setlocation("����");
		f3.setname("ĵ��");
		f3.setcolor("��ɫ");
		f3.setlocation("����");
		System.out.println(f1.tostring());
		System.out.println(f2.tostring());
		System.out.println(f3.tostring());

	}
}

class flower {
	private String name;
	private String color1;
	private String location;

	public void setname(String name) {
		this.name = name;
	}

	public void setcolor(String color1) {
		this.color1 = color1;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public String getname() {
		return name;
	}

	public String getlocation() {
		return location;
	}

	public String tostring() {
		String information = "�������ƣ�" + name + ";" + "������ɫ��" + color1 + ";" + "" + "���ĳ����أ�" + location + "";
		return information;
	}
}