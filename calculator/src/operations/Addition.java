package operations;

public class Addition extends Operation{
	// сложение
	private double a;
	private double b;
	private double c;

	public Addition(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double get() {
		c = a + b;
		return c;
	}
}
