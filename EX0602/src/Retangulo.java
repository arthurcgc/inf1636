import java.lang.Math;

public class Retangulo {
	protected Ponto[] vert = new Ponto[4];

	public static Retangulo create(Ponto p1,Ponto p3) {
			
			if(p1.getX() == p3.getX() || p1.getY() == p3.getY())
				return null;
		
			
			double d = p1.dist(p3);
			Ponto p2 = new Ponto(p1.getX(), p3.getY());
			double lado1 = p1.dist(p2);
			double lado2 = p3.dist(p2);
			Ponto p4 = new Ponto(p3.getX(), p1.getY());
			
			if(lado1 == lado2)
				return new Quadrado(p1, p2, p3, p4);
			
			return new Retangulo(p1, p2, p3, p4);
			
	}
	
	Retangulo(Ponto p1,Ponto p2,Ponto p3,Ponto p4) {
		this.vert[0] = p1;
		this.vert[1] = p2;
		this.vert[2] = p3;
		this.vert[3] = p4;
	}
	
	public double perimetro() {
		double lado1 = 0;
		double lado2 = 0;
		
		for(int i = 0; i < 4; i++)
		{
			for(int j = i + 1; j < 4; j++ )
			{
				if(vert[i].getX() == vert[j].getX()) 
					lado1 = vert[i].dist(vert[j]);
				else if( vert[i].getY() == vert[j].getY() )
					lado2 = vert[i].dist(vert[j]);
			}
		}
		
		return lado1*2 + lado2*2;
	}

	public void tipo() {
		System.out.println("Sou um Retangulo");
	}
}