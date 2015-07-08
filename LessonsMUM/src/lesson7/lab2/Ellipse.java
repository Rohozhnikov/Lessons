package lesson7.lab2;

public class Ellipse implements ClosedCurve {

	private double a;
	private double E;

	public Ellipse(int a, int e) {
		super();
		this.a = a;
		E = e;
	}

	@Override
	public double computePerimeter() {
		return 4 * a * E;
	}

}
