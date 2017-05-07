package Day15;

/**
 * @author August Zhu
 *
 */
public class first {
	public static void main (String [] args){
		for (int i=1;i<5;++i){
			i=++i;
			System.out.println(i);
			i=i++;
			System.out.println(i);
		}
		
	}

}
