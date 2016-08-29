package operations;

public class Division extends Operation{
	//деление
	private double a;
	private double b;
	private double c;
	public Division(double a, double b){
		this.a = a;
		this.b = b;
	}
	public double get(){
		c = a / b;
		return c;
	}
}
