package operations;

public class Division extends Operation {

	public Division(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a / b;
	}
}
