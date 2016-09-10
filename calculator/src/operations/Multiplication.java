package operations;

public class Multiplication extends Operation {

	public Multiplication(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a * b;
	}
}
