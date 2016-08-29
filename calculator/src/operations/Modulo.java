package operations;

public class Modulo extends Operation{
	// остаток от деления
	private double a;
	private double b;
	private double c;

	public Modulo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double get() {
		c = a % b;
		return c;
	}
}
