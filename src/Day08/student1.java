package Day08;

/**
 * @author August Zhu
 *
 */
class student1 extends school {
	String studentname;
	String  studentcode;
	String studentsexy;
	String studentbirthday;
	String studentaddress;
	void setlocation(String location ){
		this.location=location;
	}
	
	String getlocation() {
		return location;
	}
	public String getStudentname() {
		return studentname;
	}
	public String getStudentcode() {
		return studentcode;
	}
	public String getStudentsexy() {
		return studentsexy;
	}
	public String getStudentbirthday() {
		return studentbirthday;
	}
	public String getStudentaddress() {
		return studentaddress;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public void setStudentcode(String studentcode) {
		this.studentcode = studentcode;
	}
	public void setStudentsexy(String studentsexy) {
		this.studentsexy = studentsexy;
	}
	public void setStudentbirthday(String studentbirthday) {
		this.studentbirthday = studentbirthday;
	}
	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}
	public String tostring(){
		String infor=super.tostring()+"�WУ��ַ"+location+""
	+"�W������"+studentname+";"+""+"�W̖��"+studentcode+";"
				+""+"�Ԅe��"+studentsexy+";"+""+"�������ڣ�"
	+studentbirthday+"��"+""+"��ͥ��ַ��"+studentaddress;
		return infor;
	}
}
