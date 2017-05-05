package Day13;

import java.io.File;

/**
 * @author August Zhu
 *
 */
public class file {
	public static void main(String [] args){
		File f=new File("d:\\","file.txt");
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
	}

}
