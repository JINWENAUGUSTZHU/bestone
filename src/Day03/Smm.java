package Day03;

/**
 * @author August Zhu
 *����java�ҵ�main������ڣ�Ȼ������������Smm�½���һ������a,��Ϊ��Smm�Ǽ̳�Sub,���Զ���a��ͬʱ��ʼ������������i,jΪ0,Ȼ���Ȼ�Ǽ̳С�����SmmҪ���ø���sub�ķ������ʸ�����ִ��,i�ͱ���ֵΪ20������ִ�и������ڵķ���print(),ע���ʱ������ʵ����print()����д������ִ������ķ���print(j)����ʱjΪ0�����Դ�ӡ0�������������࣬i����ֵΪ30���ص����࣬j����ֵΪ30��Ȼ�����ִ�е������print()��������ӡj,Ҳ����30��������������j����ֵΪ40��Ȼ������������һ��bb,�Ѷ���a��j������ֵ��bb,���Ҵ�ӡ��bb,���Ե����δ�ӡ����40���������������0,30,40

 */
class sub {
	int i=20;
	
	sub(){
		print();
		i=30;
	}
	void print(){
		System.out.println(i);
	}
}
/**
 * @author August Zhu
 *
 */
public class Smm extends sub {
	int j=30;
	Smm(){
		print();
		j=40;
	}
	void print(){
		System.out.println(j);
	}
	public static void main(String[] args)
	{
		Smm a =new Smm();
		int bb=a.j;
		System.out.println(bb);
		
	}
}