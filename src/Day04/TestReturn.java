package Day04;

public class TestReturn { 
    public static void main(String args[]) { 
       TestReturn t = new TestReturn(); 
        t.test1(); 
        t.test2(); 
    } 

    /** 
     * 无返回值类型的return语句测试 
     */ 
    public void test1() { 
        System.out.println("---------无返回值类型的return语句测试--------"); 
        for (int i = 1; ; i++) { 
            if (i == 4) return; 
            System.out.println("i = " + i); 
        } 
    } 

    /** 
     * 有返回值类型的return语句测试 
     * @return String 
     */ 
    public String test2(){ 
        System.out.println("---------有返回值类型的return语句测试--------"); 
        return "返回一个字符串"; 
    } 
}