package Day08;

/**
 * @author August Zhu
 *
 */
public class flowertest {
	public static void main(String[] args) {
		flower1 f1 = new flower1();
		flower1 f2 = new flower1();
		f1.setcolor("�tɫ");
		f1.setname("ĵ��");
		f1.setcountry("�Ї�");
		f1.setcity("���");

		f2.setcolor("�Sɫ");
		f2.setname("õ��");
		f2.setcountry("����");
		f2.setcity("��˹�S��˹");
		System.out.println(f1.tostring());
		System.out.println(f2.tostring());
	}
}

interface flower {
	void setcolor(String color1);

	void setname(String name);

	String getcolor();

	String getname();
}

class flowers implements flower {
	private String color1;
	private String name;

	public void setcolor(String color1) {
		this.color1 = color1;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcolor() {
		return color1;
	}

	public String getname() {
		return name;
	}

	public String tostring() {
		String information = "�������Q�ǣ�" + name + "��" + "" + "�����ɫ�ǣ�" + color1;
		return information;
	}
}

class flower1 extends flower {
	private String country;
	private String city;

	public void setcountry(String country) {
		this.country = country;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getcountry() {
		return country;
	}

	public String getcity() {
		return city;
	}

	public String tostring() {
		String information = super.toString() + "" + "�@�N�����Y�ć��ң�" + country + "��" + "" + "���Եĳ��У�" + city;
		return information;
	}
}