package lesson7.lab2;

public interface Polygon extends ClosedCurve {

	double[] getSides();

	@Override
	default double computePerimeter() {
		double[] side = getSides();
		double sum = 0;
		for (int i = 0; i < side.length; i++) {
			sum += side[i];
		}

		return sum;
	}
}
