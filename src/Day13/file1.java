package Day13;

import java.io.File;

/**
 * @author August Zhu
 *
 */
public class file1 {
	public void print(File f) {
		if (f.isDirectory()) {
			System.out.println("这是一个目录！");
		} else {
			System.out.println("这不是一个目录！");
		}
		if (f.exists()) {
			System.out.println("这个文件是存在的！");
		} else {
			System.out.println("这个文件是不存在的！");
			try {
				f.createNewFile();
			} catch (Exception e) {
			}
		}
	}
	public void print1(File f){
		System.out.println(f.getName());
		System.out.println(f.getParent());
		System.out.println(f.getPath());
	}

	public void print2(File f) {
		if (f.isFile()) {
			System.out.println(f.lastModified());
			System.out.println(f.length());
		}
	}

	public static void main(String[] args) {
		file1 f1 = new file1();
		File f = new File("d:\\filetest", "file.txt");
		f1.print(f);
		f1.print1(f);
		f1.print2(f);
	}
}
