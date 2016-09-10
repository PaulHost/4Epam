package operations;

public abstract class Operation {
	
	protected double a;
	protected double b;

	public Operation(double a, double b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}

	public abstract double get();
}
