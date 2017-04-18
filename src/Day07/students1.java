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
		String infor = "學生姓名：" + name + "學號：" + code + "性別：" + sexy + "出生年月：" + birthday + "家庭地址：" + address;
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
				System.out.println("學生姓名：" + students1.this.name + "學生學號：" + students1.this.code + "一共選擇了：" + coursenum
						+ "門科，分別是：");
				get();
			}

		}
		new course(courses);
	}

	public static void main(String[] args) {
		String[] courses = { "語文", "數學", "英語", "化學" };
		students1 st = new students1();
		st.setname("王浩");
		st.setcode("200123");
		st.setsexy("男");
		st.setbirthday("0317");
		st.setaddress("北京海淀區");
		System.out.println(st.tostring());
		st.setstudentcourse(courses);
	}
}
