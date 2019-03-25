
public class vetor {
	private double x;
	private double y;
	
	public vetor()
	{
		x = 0;
		y = 0;
	}

	public vetor(double xx, double yy)
	{
		this.x = xx;
		this.y = yy;
	}
	
	public double getX() 
	{
		return x;
	}

	public void setX(double x) 
	{
		this.x = x;
	}

	public double getY() 
	{
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public vetor(double x)
	{
		this.x = x;
		this.y = 0;
	}
	
	public void soma(vetor v2)
	{
		this.x += v2.x;
		this.y += v2.y;
	}
	
	public void exibe()
	{
		System.out.println("x: " + this.x + "\n" + "y: " + this.y);
	}
	
	{
		System.out.println("x: " + this.x + "\n" + "y: " + this.y);
	}
}
