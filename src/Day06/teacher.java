package Day06;

/**
 * @author August Zhu
 *
 */
class teacher implements school {
	private String schoolname;
	private String classname;
	private String teachername;
	private String teachercode;
	private String teachersexy;
	private String teacherbirthday;
	private String familyaddress;

	public void setschoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public void setclassname(String classname) {
		this.classname = classname;
	}

	public void setteachername(String teachername) {
		this.teachername = teachername;
	}

	public void setteachercode(String teachercode) {
		this.teachercode = teachercode;
	}

	public void setteachersexy(String teachersexy) {
		this.teachersexy = teachersexy;
	}

	public void setteacherbirthday(String teacherbirthday) {
		this.teacherbirthday = teacherbirthday;
	}

	public void setfamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public String getclassname() {
		return classname;
	}

	public String getteachername(String teachername) {
		return teachername;
	}

	public String getteachercode(String teachercode) {
		return teachercode;
	}

	public String getteachersexy(String teachersexy) {
		return teachersexy;
	}

	public String getteacherbirthday(String teacherbirthday) {
		return teacherbirthday;
	}

	public String getfamilyaddress(String familyaddress) {
		return familyaddress;
	}

	public String toString() {
		String infor = "学校  名称：" + schoolname + "" + "班级名称：" + classname + "" + "教師姓名：" + teachername + "" + "教師工号："
				+ teachercode + "性别：" + teachersexy + "出生年月：" + teacherbirthday + "" + "家庭地址：" + familyaddress;
		return infor;
	}
}
