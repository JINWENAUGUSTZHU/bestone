package Day06;

/**
 * @author August Zhu
 *school为interface
 *student和teacher类均实现school接口，故，在student和teacher类中，需要都添加（接口里的方法必须都实现,实现接口，就必须实现接口中的所有方法，哪怕是空实现也可以），于是选择 add unimplemented methods即可。自动生成@override,表示重写接口的方法。
 */
class student implements school {

	private String schoolname;
	private String classname;
	private String studentname;
	private String studentcode;
	private String studentsexy;
	private String studentbirthday;
	private String familyaddress;

	public void setschoolname(String schoolname) {
		this.schoolname = schoolname;

	}

	public void setclassname(String classname) {
		this.classname = classname;
	}

	public void setname(String studentname) {
		this.studentname = studentname;
	}

	public void setcode(String studentcode) {
		this.studentcode = studentcode;
	}

	public void setsexy(String studentsexy) {
		this.studentsexy = studentsexy;
	}

	public void setbirthday(String studentbirthday) {
		this.studentbirthday = studentbirthday;
	}

	public void setfamilyaddress(String familyaddress) {
		this.familyaddress = familyaddress;
	}

	public String getschoolname() {
		return schoolname;
	}

	public String getclassname() {
		return classname;
	}

	public String getname() {
		return studentname;
	}

	public String getcode() {
		return studentcode;
	}

	public String getsexy() {
		return studentsexy;
	}

	public String getbirthday() {
		return studentbirthday;
	}

	public String getfamilyaddress() {
		return familyaddress;
	}

	public String tostring() {
		String infor = "学校  名称：" + schoolname + "" + "班级名称：" + classname + "" + "学生姓名：" + studentname + "" + "学号："
				+ studentcode + "性别：" + studentsexy + "出生年月：" + studentbirthday + "" + "家庭地址：" + familyaddress;
		return infor;
	}

	@Override
	public void setstudentname(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setstudentcode(String code) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setstudentsexy(String sexy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setstudentbirthday(String birthday) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getstudentname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getstudentcode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getstudentsexy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getstudentbirthday() {
		// TODO Auto-generated method stub
		return null;
	}
}