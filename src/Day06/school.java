package Day06;

/**
 * @author August Zhu
 *
 */
public interface school {
	void setschoolname(String schoolname);

	void setclassname(String schoolclassname);

	void setstudentname(String name);

	void setstudentcode(String code);

	void setstudentsexy(String sexy);

	void setstudentbirthday(String birthday);

	void setfamilyaddress(String familyaddress);

	String getschoolname();

	String getclassname();

	String getstudentname();

	String getstudentcode();

	String getstudentsexy();

	String getstudentbirthday();

	String getfamilyaddress();
}
