package Day07;

/**
 * @author August Zhu
 *
 */
public class students1 {
	private String name;
	private String code;
	private String sexy;
	private String birthday;
	private String address;

	public void setname(String name) {
		this.name = name;
	}

	public void setcode(String code) {
		this.code = code;
	}

	public void setsexy(String sexy) {
		this.sexy = sexy;
	}

	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public String getname() {
		return name;
	}

	public String getcode() {
		return code;
	}

	public String getsexy() {
		return sexy;
	}

	public String getbirthday() {
		return birthday;
	}

	public String getaddress() {
		return address;
	}

	public String tostring() {
		String infor = "�W��������" + name + "�W̖��" + code + "�Ԅe��" + sexy + "�������£�" + birthday + "��ͥ��ַ��" + address;
		return infor;
	}

	public void setstudentcourse(String[] courses) {
		class course {
			private String[] courses;
			private int coursenum;

			public course(String[] course) {
				courses = course;
				coursenum = course.length;
				getinfo();
			}

			private void get() {
				for (int i = 0; i < coursenum; i++) {
					System.out.println("" + courses[i]);
				}
			}

			private void getinfo() {
				System.out.println("�W��������" + students1.this.name + "�W���W̖��" + students1.this.code + "һ���x���ˣ�" + coursenum
						+ "�T�ƣ��քe�ǣ�");
				get();
			}

		}
		new course(courses);
	}

	public static void main(String[] args) {
		String[] courses = { "�Z��", "���W", "Ӣ�Z", "���W" };
		students1 st = new students1();
		st.setname("����");
		st.setcode("200123");
		st.setsexy("��");
		st.setbirthday("0317");
		st.setaddress("��������^");
		System.out.println(st.tostring());
		st.setstudentcourse(courses);
	}
}
