package Day08;

/**
 * @author August Zhu
 *
 */
public class abstracttest {
	public static void main(String []args){
		student1 s1=new student1();
		student3 s3=new student3();
		s1.setSchoolname("重庆大学");
		s1.setClassname("计算机三班");
		s1.setlocation("沙坪坝");
		s1.setStudentname("王浩");
		s1.setStudentcode("95012");
		s1.setStudentsexy("男");
		s1.setStudentbirthday("1976-07-14");
		s1.setStudentaddress("重庆市解放碑");
		s3.setSchoolname("四川大学");
		s3.setClassname("机械系一班");
		s3.setlocation("成都市");
		s3.setStudentname("董洁");
		s3.setStudentcode("33012");
		s3.setStudentsexy("女");
		s3.setStudentbirthday("1974-08-21");
		s3.setStudentaddress("成都市区");
		System.out.println(s1.tostring());
		System.out.println(s3.tostring());
	}

}
