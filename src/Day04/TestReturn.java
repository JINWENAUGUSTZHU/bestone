package Day04;

/**
 * @author August Zhu
 *
 */
public class TestReturn { 
    public static void main(String args[]) { 
       TestReturn t = new TestReturn(); 
        t.test1(); 
        t.test2();
        System.out.println(t.test2());
    } 

    /** 
     * �޷���ֵ���͵�return������ 
     */ 
    public void test1() { 
        System.out.println("---------�޷���ֵ���͵�return������--------"); 
        for (int i = 1; ; i++) { 
            if (i == 4) return; 
            System.out.println("i = " + i); 
        } 
    } 

    /** 
     * �з���ֵ���͵�return������ 
     * @return String 
     */ 
    public String test2(){ 
        System.out.println("---------�з���ֵ���͵�return������--------"); 
        return "����һ���ַ���"; 
    } 
}