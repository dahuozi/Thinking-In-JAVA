/**
 * @Title 这是一个多态测试类
 * @author DaHuoZi
 * @author cqupt7lang@gmail.com
 */
public class ShapeTest{
	private  static RandomShape rs=new RandomShape();
	public static void main(String[] args){
		Shape [] s =new Shape[3];
		s[1]=rs.next();
		s[2]=rs.next1();
		s[0]=rs.next();
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();		
		}
	}
}
