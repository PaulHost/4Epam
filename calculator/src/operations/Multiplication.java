package operations;

public class Multiplication extends Operation {

	private double a;
	private double b;

	public Multiplication(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a * b;
	}
}
