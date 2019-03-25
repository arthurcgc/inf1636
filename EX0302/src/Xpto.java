
public class Xpto 
{
	public static int contInst;
	
	
	public Xpto()
	{
		Xpto.contInst++;
	}
	
	public static int getQtdInst()
	{
		return Xpto.contInst;
	}
}
