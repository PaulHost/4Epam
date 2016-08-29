package operations;

public class Multiplication extends Operation {
	// умножение
	private double a;
	private double b;
	private double c;

	public Multiplication(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double get() {
		c = a * b;
		return c;
	}
}
