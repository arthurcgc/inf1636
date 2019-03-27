import java.lang.Math;

public class Ponto {
	private double x,y;
	
	public Ponto(double x,double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
		
	public double dist(Ponto p) {
		double x_abs = Math.abs(p.x-this.x);
		double y_abs = Math.abs(p.y - this.y);
		
		return Math.sqrt(Math.pow(x_abs, 2) + Math.pow(y_abs, 2));	
	}
}
