package Day02;

import java.io.UnsupportedEncodingException;

/**
 * @author August Zhu
 *
 */
public class str6 {
	public static void main(String[] args) {
		byte[] b = { 97, 98, 99, 100, 101, 102 };
		try {
			String str = new String(b, 3, 1, "utf-8");
			System.out.println(str);
		} catch (UnsupportedEncodingException ex) {
		}
	}

}
