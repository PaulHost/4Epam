package operations;

public class Subtraction extends Operation{
	//вычитание
	private double a;
	private double b;
	private double c;
	public Subtraction(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double get(){
		c = a - b;
		return c;
	}
}
