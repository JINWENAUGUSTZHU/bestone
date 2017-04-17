package Day05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author August Zhu
 *
 */
public class testFactor {

	public static void main(String[] args ){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int factor=input.nextInt();
		ArrayList abc=new ArrayList();
		for (int i=2;i<=factor;i++){
			if(factor%i==0){
				factor=factor/i;
				abc.add(i);
			}
		}
		System.out.println(abc);
	} 
}
