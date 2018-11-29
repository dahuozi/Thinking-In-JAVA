public class RandomShape{
	public Shape next(){
		return new Circle();
	}
	public Shape next1(){
		return new Square();
	}
}
