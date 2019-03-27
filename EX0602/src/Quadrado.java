
public class Quadrado extends Retangulo {
	Quadrado(Ponto p1,Ponto p2,Ponto p3,Ponto p4) {
		super(p1, p2, p3, p4);
	}
	
	public double perimetro() {
		// complete o codigo
		return this.vert[0].dist(this.vert[1])*4;
	}
	
	public void tipo() {
		System.out.println("Sou um Quadrado");
	}
}