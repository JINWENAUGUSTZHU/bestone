package Day07;//������Dragon����ļ�Dragon.java��Day07����

/**
 * ����һ��������
 * 
 * @author August Zhu
 *
 */
public class Dragon {
	/**
	 * ���е���������name�@��������name����� �ı���String:�ַ�����
	 */
	String name;
	/**
	 * ���е����������gage�@������
	 */
	int age;

	/**
	 * ��������������attack
	 */
	public void attack() {
		// �@������Ҫ���еĴ��a
		//�ڷ����п���ʹ�ñ���x�Č���
		System.out.println(name+"�ڹ���...");
	}
	
	/**
	 * ��B�Լ�
	 */
	public void introduceMyself(){
		System.out.println("��Һã��ҵ����ֽ�"+name+",����"+age+"�q��");
//		if(age>2500){
//			System.out.println("���ǽ𵤾���");
//		}else{
//				System.out.println("����Ԫ�뾳��");
//			}
		if(age<500){
			System.out.println("���ǽ𵤾���");
		}else if(age>=500&&age<1000){
			System.out.println("����Ԫ�뾳��");
		}else{
			System.out.println("����Ԫ�뾳��");
		}
		}
	}

