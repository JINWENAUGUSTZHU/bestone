package Day08;

/**
 * @author August Zhu
 *
 */
public class abstracttest {
	public static void main(String []args){
		student1 s1=new student1();
		student3 s3=new student3();
		s1.setSchoolname("�����ѧ");
		s1.setClassname("���������");
		s1.setlocation("ɳƺ��");
		s1.setStudentname("����");
		s1.setStudentcode("95012");
		s1.setStudentsexy("��");
		s1.setStudentbirthday("1976-07-14");
		s1.setStudentaddress("�����н�ű�");
		s3.setSchoolname("�Ĵ���ѧ");
		s3.setClassname("��еϵһ��");
		s3.setlocation("�ɶ���");
		s3.setStudentname("����");
		s3.setStudentcode("33012");
		s3.setStudentsexy("Ů");
		s3.setStudentbirthday("1974-08-21");
		s3.setStudentaddress("�ɶ�����");
		System.out.println(s1.tostring());
		System.out.println(s3.tostring());
	}

}
