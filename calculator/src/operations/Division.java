package operations;

public class Division extends Operation {

	private double a;
	private double b;

	public Division(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a / b;
	}
}
