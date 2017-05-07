package Day14;

/**
 * @author August Zhu
 *
 */
public class fourth {
public static void main(String [] args){
	String temp="";
	String str1="international";
	String str2="chinasoft";
	if (str1.compareTo(str2)>0){
		temp=str2;
		str2=str1;
		str1=temp;
	}
	System.out.println(str1+""+str2);
}
}
