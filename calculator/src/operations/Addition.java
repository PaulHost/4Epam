package operations;

public class Addition extends Operation{
	
	private double a;
	private double b;

	public Addition(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a + b;
	}
}
