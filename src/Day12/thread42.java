package Day12;

/**
 * @author August Zhu
 *
 */
public class thread42 {
	public static void main(String[] agrs) {
		flower f1 = new flower();
		flower f2 = new flower();
		flower f3 = new flower();
		f1.setname("牡丹");
		f1.setcolor("红色");
		f1.setlocation("云南");
		f2.setname("牡丹");
		f2.setcolor("红色");
		f2.setlocation("云南");
		f3.setname("牡丹");
		f3.setcolor("红色");
		f3.setlocation("云南");
		System.out.println(f1.tostring());
		System.out.println(f2.tostring());
		System.out.println(f3.tostring());

	}
}

class flower {
	private String name;
	private String color1;
	private String location;

	public void setname(String name) {
		this.name = name;
	}

	public void setcolor(String color1) {
		this.color1 = color1;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public String getname() {
		return name;
	}

	public String getlocation() {
		return location;
	}

	public String tostring() {
		String information = "花的名称：" + name + ";" + "花的颜色：" + color1 + ";" + "" + "花的出产地：" + location + "";
		return information;
	}
}