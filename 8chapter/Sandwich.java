/**
 *  此文件为测试组合继承以及多态性在构建顺序上的作用
 */

class Meal{
	Meal(){
		System.out.println("Mean()");
	}
}
class Bread{
	Bread(){
		System.out.println("Bread()");
	}
}
class Cheese{
	Cheese(){
		System.out.println("Cheese()");
	}
}
class Lettuce{
	Lettuce(){
		
		System.out.println("Letuce()");
	}
}
class Lunch extends Meal{
	Lunch(){

		System.out.println("Lunch()");
	}
}
class Porn extends Lunch{
	Porn(){
		
		System.out.println("Porn()");
	}
}
public class  Sandwich extends Porn{
	private Meal m=new Meal();
	private Bread b=new Bread();
	private Cheese c=new Cheese();
	public Sandwich(){

		System.out.println("Sandwich()");
	}
	public static void main(String[] args){
		new Sandwich();
	}
}
