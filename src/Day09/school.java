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
			System.out.println("���ѧ����ƽ���ɼ��ǣ�" + i + "��" + (avg + i * 2));
		}
	}

	public String tostring() {
		String information = "ѧУ ���ƣ�" + schoolname + ";" + "" + "�����꼶��" + grade + ";" + "" + "�����꼶��" + grade + ";" + ""
				+ "ѧ��������" + studentname + ";" + ";" + "" + "ѧ��ѧ�ţ�" + studentcode + ";" + "" + "ѧ���Ա�" + studentsexy
				+ ";" + "" + "ѧ��ƽ����" + studentavg;
		return information;
	}
}