package lesson7.lab2;

public class EquilateralTriangle implements Polygon {
	double side;

	public EquilateralTriangle(double side) {
		this.side = side;
	}

	// @Override
	// public double computePerimeter() {
	// double sum = 0;
	// for (int i = 0; i < getSides().length; i++) {
	// sum += getClass();
	// }
	// return 0;
	// }

	@Override
	public double[] getSides() {
		return new double[] { side, side, side };
	}

}
