package Day09;

/**
 * @author August Zhu
 *
 */
interface school {
	void set(String schoolname, String grade);

	String getschool();

	String getgrade();
}

class student implements Runnable, school {
	String schoolname;
	String grade;
	String studentname;
	String studentcode;
	String studentsexy;
	String studentcourse;
	String studentavg;

	public student(String studentname, String studentcode, String studentsexy, String studentcourse) {
		this.studentname = studentname;
		this.studentcode = studentcode;
		this.studentsexy = studentsexy;
		this.studentcourse = studentcourse;
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
		int avg = 85;
		for (; i < 13; i++) {
			System.out.println("这个学生的平均成绩是：" + i + "月" + (avg + i * 2));
		}
	}

	public String tostring() {
		String information = "学校 名称：" + schoolname + ";" + "" + "所读年级：" + grade + ";" + "" + "所读年级：" + grade + ";" + ""
				+ "学生姓名：" + studentname + ";" + ";" + "" + "学生学号：" + studentcode + ";" + "" + "学生性别：" + studentsexy
				+ ";" + "" + "学生平均分" + studentavg;
		return information;
	}
}