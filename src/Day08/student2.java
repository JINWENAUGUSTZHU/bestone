package Day08;

/**
 * @author August Zhu
 *
 */
abstract  class student2 extends school {
	String studentname;
	String studentcode;
	String studentsexy;
	String studentbirthday;
	String studentaddress;
	abstract void setlocation(String location);
	abstract String getlocation();
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
	   String infor=super.tostring()+"�W��������"+studentname+";"+""+"�W̖��"+studentcode+""+"�Ԅe��"+studentsexy+";"+""+"�������ڣ�"
   +studentbirthday+";"+""+"��ͥ��ַ��"+studentaddress;
	   return infor;
   }
}
