package operations;

public class Modulo extends Operation {

	private double a;
	private double b;

	public Modulo(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a % b;
	}
}
