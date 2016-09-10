package operations;

public class Addition extends Operation{

	public Addition(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a + b;
	}
}
