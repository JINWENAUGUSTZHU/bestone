package Day09;

/**
 * @author August Zhu һ�������ʵ�����������ӿڣ���һ���಻�ܼ̳��������������ϵ���
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
			System.out.println("�����ʦ��нˮ�ǣ�" + i + "��" + (teachersalary + i * 300));
		}
	}

	public String tostring() {
		String information = "ѧУ���ƣ�" + schoolname + ";" + "" + "�����꼶��" + grade + ";" + "" + "�����꼶��" + grade + ";" + ""
				+ "��ʦ������" + teachername + ";" + "" + "��ʦ���ţ�" + teachercode + ";" + "" + "��ʦ�Ա�" + teachersexy + ";" + ""
				+ "���̿γ̣�" + teachercourse + ";" + "" + "��ʦнˮ" + teachersalary;
		return information;
	}
}
