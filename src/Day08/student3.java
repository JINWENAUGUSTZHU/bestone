package Day08;

 /**
 * @author August Zhu
 *
 */
class student3 extends student2 {
	 void setlocation(String location){
		 this.location=location;
	 }
	 String getlocation(){
		 return location;
	 }
public String tostring(){
	String infor=super.tostring()+"�WУ��ַ��"+location+";"
			+"";
	return infor;
}
}
