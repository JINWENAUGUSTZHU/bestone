package Day06;

/**
 * @author August Zhu
 *schoolΪinterface
 *student��teacher���ʵ��school�ӿڣ��ʣ���student��teacher���У���Ҫ����ӣ��ӿ���ķ������붼ʵ��,ʵ�ֽӿڣ��ͱ���ʵ�ֽӿ��е����з����������ǿ�ʵ��Ҳ���ԣ�������ѡ�� add unimplemented methods���ɡ��Զ�����@override,��ʾ��д�ӿڵķ�����
 */
public class schooltest {
public static void main(String[] args){
	student st1=new student();
	student st2=new student();
	teacher te1=new teacher();
	teacher te2=new teacher();
	st1.setschoolname("a��W");
	st1.setclassname("a�༉");
	st1.setname("a");
	st1.setcode("a�W̖");
	st1.setsexy("��");
	st1.setbirthday("ÿ���һ��ĳ��");
	st1.setfamilyaddress("aδ֪");
	st2.setschoolname("b��W");
	st2.setclassname("b�༉");
	st2.setname("b");
	st2.setcode("b�W̖");
	st2.setsexy("��");
	st2.setbirthday("bÿ���һ��ĳ��");
	st2.setfamilyaddress("bδ֪");
	te1.setschoolname("a��W");
	te1.setclassname("a�༉");
	te1.setteachercode("a�W̖");
	te1.setteachersexy("��");
	te1.setteachername("a");
	te1.setteacherbirthday("ÿ���һ��ĳ��");
	te1.setfamilyaddress("aδ֪");
	te2.setschoolname("b��W");
	te2.setclassname("b�༉");
	te2.setteachercode("b�W̖");
	te2.setteachersexy("��");
	te2.setteachername("b");
	te2.setteacherbirthday("ÿ���һ��ĳ��");
	te2.setfamilyaddress("bδ֪");
	System.out.println(st1.tostring());
	System.out.println(st2.tostring());
	System.out.println(te1.toString());
	System.out.println(te2.toString());
}
}
