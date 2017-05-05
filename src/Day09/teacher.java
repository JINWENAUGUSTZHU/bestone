package Day09;

/**
 * @author August Zhu 一个类可以实现两个或多个接口，但一个类不能继承两个或两个以上的类
 */
class teacher implements Runnable, school {
	String schoolname;
	String grade;
	String teachername;
	String teachercode;
	String teachersexy;
	String teachercourse;
	String teachersalary;

	public teacher(String teachername, String teachercode, String teachersexy, String teachercourse) {
		this.teachername = teachername;
		this.teachercode = teachercode;
		this.teachersexy = teachersexy;
		this.teachercourse = teachercourse;
		this.tostring();
	}

	public void set(String schoolname, String grade) {
		this.schoolname = schoolname;
		this.grade = grade;
	}

	public String getschool() {
		return schoolname;
	}

	public String getgrade() {
		return grade;
	}

	public void run() {
		int i = 1;
		int teachersalary = 2000;
		for (; i < 13; i++) {
			System.out.println("这个老师的薪水是：" + i + "月" + (teachersalary + i * 300));
		}
	}

	public String tostring() {
		String information = "学校名称：" + schoolname + ";" + "" + "所教年级：" + grade + ";" + "" + "所教年级：" + grade + ";" + ""
				+ "教师姓名：" + teachername + ";" + "" + "教师工号：" + teachercode + ";" + "" + "教师性别：" + teachersexy + ";" + ""
				+ "所教课程：" + teachercourse + ";" + "" + "教师薪水" + teachersalary;
		return information;
	}
}
