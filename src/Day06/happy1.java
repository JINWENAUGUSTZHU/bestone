package Day06;

import java.util.Scanner;

/**
 * @author August Zhu
 *
 */
public class happy1 {
public static void main(String[] args){
               int i,j,k,n;
               Scanner input=new Scanner(System.in);
               System.out.println("ÇëÊäÈë½ğ×ÖËş²ãÊı£º");
               n=input.nextInt();
               
	for (i=1;i<=n;i++)
	{
		for (j=1;j<n-1;j++)
			System.out.print(" ");
		for(k=1;k<=2*1-1;k++)
			System.out.printf("*");
		System.out.printf("\n");
	}
}
}
