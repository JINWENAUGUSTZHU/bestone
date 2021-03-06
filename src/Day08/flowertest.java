package Day08;

/**
 * @author August Zhu
 *定义一个接口flower,flowers实现接口，类flower1继承flowers类
 *从面向对象的角度来说，函数是对象的行为，被称为方法，数据则称为对象的属性；
 */
public class flowertest {
	public static void main(String[] args) {
		flower1 f1 = new flower1();
		flower1 f2 = new flower1();
		f1.setcolor("紅色");
		f1.setname("牡丹");
		f1.setcountry("中國");
		f1.setcity("沈陽");

		f2.setcolor("黃色");
		f2.setname("玫瑰");
		f2.setcountry("美國");
		f2.setcity("拉斯維加斯");
		System.out.println(f1.tostring());
		System.out.println(f2.tostring());
	}
}

interface flower {
	void setcolor(String color1);

	void setname(String name);

	String getcolor();

	String getname();
}

class flowers implements flower {
	private String color1;
	private String name;

	public void setcolor(String color1) {
		this.color1 = color1;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcolor() {
		return color1;
	}

	public String getname() {
		return name;
	}

	public String tostring() {
		String information = "花的名稱是：" + name + "；" + "" + "花的顏色是：" + color1;
		return information;
	}
}

class flower1 extends flowers {
	private String country;
	private String city;

	public void setcountry(String country) {
		this.country = country;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getcountry() {
		return country;
	}

	public String getcity() {
		return city;
	}

	public String tostring() {
		String information = super.tostring() + "" + "這種花出資的國家：" + country + "；" + "" + "出自的城市：" + city;
		return information;
	}
}