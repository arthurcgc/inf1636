
public class Assento {
	private int fila;
	private char assento;
	private boolean livre = true;
	
	
	public Assento(int f, char a)
	{
		fila = f;
		assento = a;
	}
	
	public boolean getEstado()
	{
		return livre;
	}
	
	public boolean reserva()
	{
		if(livre)
		{
			livre = false;
			return true;
		}
		else
		{
			System.out.println("Assento ocupado");
			return false;
		}
	}
}
