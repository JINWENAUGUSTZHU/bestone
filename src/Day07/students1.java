package Day07;

/**
 * @author August Zhu
 *
 */
public class students1 {
   private String name;
   private String code;
   private String sexy;
   private String birthday;
   private String address;
   public void setname(){
	   this.name=name;
   }
   public void setcode(){
	   this.code=code;
   }
   public void setsexy(){
	   this.sexy=sexy;
   }
   public void setbirthday(){
	   this.birthday=birthday;
   }
   public void setaddress(){
	   this.address=address;
   }
   public String getname(){
	   return name;
   }
   public String getcode(){
	   return code;
   }
   public String getsexy(){
	   return sexy;
   }
   public String getbirthday(){
	   return birthday;
   }
   public String getaddress(){
	   return address;
   }
   public String tostring(){
	   String infor="學生姓名："+name+"學號："+code+"性別："+sexy+"出生年月："+birthday+"家庭地址："+address;
	   return infor;
   }
   
}
