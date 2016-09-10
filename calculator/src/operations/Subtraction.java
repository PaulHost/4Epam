package operations;

public class Subtraction extends Operation {

	private double a;
	private double b;

	public Subtraction(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a - b;
	}
}
