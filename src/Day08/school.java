package Day08;

/**
 * @author August Zhu
 *
 */
abstract class school {
	String schoolname;
	String classname;
	String location;

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getSchoolname() {
		return schoolname;
	}

	public String getClassname() {
		return classname;
	}

	abstract void setlocation(String location);

	abstract String getlocation();

	public String tostring() {
		String infor = "�WУ ���Q��" + schoolname + ";" + "" + "�༉���Q" + classname;
		return infor;
	}

	

}