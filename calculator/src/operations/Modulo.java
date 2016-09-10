package operations;

public class Modulo extends Operation {
	
	public Modulo(double a, double b) {
		super(a, b);
	}

	public double get() {
		return a % b;
	}
}
