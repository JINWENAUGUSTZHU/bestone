package Day03;

/**
 * @author August Zhu
 *
 */
public class people {
private String name;
private String sex;
private int age;
private double weight;

 public  people (String jname,String jsex,int jage, double jweight){
	 name=jname;
	 sex=jsex;
	 age=jage;
	 weight=jweight;
 }
   public String eat (String food){
	 return "���ڳ�"+food ;
 }
 public void game(){
	 System.out.println("���ڴ���Ϸ");
 }
 public static void main(String[] args){
	 people people= new people ("����","��",21,65);
	 System.out.println("����"+people.name);
	 System.out.println("����"+people.sex);
	 System.out.println("����"+people.age);
	 System.out.println("����"+people.weight);
	 people.game();
	 String food="�ɿڵ��׷�";
	people.eat(food);
 }
 }