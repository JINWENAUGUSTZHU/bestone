package Day02;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author August Zhu
 *
 */
public abstract class GregorianCalendar2 {
public static void main (String[]args)
{   GregorianCalendar gc=new GregorianCalendar();
gc.set(2009,06,18);
System.out.println(gc.get(Calendar.YEAR));
System.out.println(gc.get(Calendar.MONTH));
System.out.println(gc.get(Calendar.DATE));

	}
}
