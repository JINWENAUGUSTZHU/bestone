package Day02;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendar2 {
public static void main(String[] args)
{
GregorianCalendar gc=new GregorianCalendar();
final char[]kor_week={'��','һ','��','��','��','��','��'};
for (int i=2007;i<=2020;i++)
{
	gc.set(i,Calendar.JULY,20);
	char week =kor_week[gc.get(Calendar.DAY_OF_WEEK)-1];
	System.out.println(i+"�������������"+week);}
}
}
