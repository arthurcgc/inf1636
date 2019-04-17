package erro;

public class SalarioZerado extends Exception{
	
	SalarioZerado() { }
	
	SalarioZerado(String msg)
	{
		super(msg);
	}
}
