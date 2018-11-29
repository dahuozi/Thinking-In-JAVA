/**
 * @title 测试多态私有继承缺陷
 * @author DaHuoZi
 */
public class PrivateOverride{
	private void f(){
		System.out.println("In private f");
	}
	public static void main(String[] args){
		PrivateOverride pv=new Derived();
		pv.f();
	}
}
