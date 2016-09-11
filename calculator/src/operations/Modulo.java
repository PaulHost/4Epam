package operations;

public class Modulo extends Operation {
	
	public Modulo(double a, double b) {
		super(a, b);
	}

	public double get() {
		if (a == 0 && b == 0) {
			return 0.0;
		} else {
			return a % b;
		}
	}
}
