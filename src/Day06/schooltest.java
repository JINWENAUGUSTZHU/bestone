package Day06;

/**
 * @author August Zhu
 *school为interface
 *student和teacher类均实现school接口，故，在student和teacher类中，需要都添加（接口里的方法必须都实现,实现接口，就必须实现接口中的所有方法，哪怕是空实现也可以），于是选择 add unimplemented methods即可。自动生成@override,表示重写接口的方法。
 */
public class schooltest {
public static void main(String[] args){
	student st1=new student();
	student st2=new student();
	teacher te1=new teacher();
	teacher te2=new teacher();
	st1.setschoolname("a大學");
	st1.setclassname("a班級");
	st1.setname("a");
	st1.setcode("a學號");
	st1.setsexy("男");
	st1.setbirthday("每年的一月某日");
	st1.setfamilyaddress("a未知");
	st2.setschoolname("b大學");
	st2.setclassname("b班級");
	st2.setname("b");
	st2.setcode("b學號");
	st2.setsexy("男");
	st2.setbirthday("b每年的一月某日");
	st2.setfamilyaddress("b未知");
	te1.setschoolname("a大學");
	te1.setclassname("a班級");
	te1.setteachercode("a學號");
	te1.setteachersexy("男");
	te1.setteachername("a");
	te1.setteacherbirthday("每年的一月某日");
	te1.setfamilyaddress("a未知");
	te2.setschoolname("b大學");
	te2.setclassname("b班級");
	te2.setteachercode("b學號");
	te2.setteachersexy("男");
	te2.setteachername("b");
	te2.setteacherbirthday("每年的一月某日");
	te2.setfamilyaddress("b未知");
	System.out.println(st1.tostring());
	System.out.println(st2.tostring());
	System.out.println(te1.toString());
	System.out.println(te2.toString());
}
}
