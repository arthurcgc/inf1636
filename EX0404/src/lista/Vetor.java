package lista;
public class Vetor {
	private double x, y;

	public Vetor(double x, double y) {
		this.x = x;
		this.y = y;
	}

	private Vetor() {
		x = y = 0;
	}

	public Vetor clone() {
		return new Vetor(this.x, this.y);
	}

	public String toString() {
			String sxy = String.format("( %.2f, %.2f )",this.x, this.y );
			return sxy;
	}
}