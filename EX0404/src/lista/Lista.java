package lista;

public class Lista
{
	private int tam = 0;
	private No ini = null;
	private No fin = null;
	private No corr = null;
	
	
	public boolean vazio()
	{
		if(ini != null)
				return false;
		else 
			return true;
	}
	
	public int getTam()
	{
		return tam;
	}
	
	public void insIni(Object x)
	{
		No n = new No(x, ini);
		ini = n;
		tam++;
	}
	
	public void insFin(Object x)
	{
		No f = new No(x, null);
		if(fin != null)
			fin.setProx(f);
		else
			ini = f;
		fin = f;
		tam++;
	}
	
	public Object retIni()
	{
		ini = ini.getProx();
		return ini.getElem();
	}
	
	public Object retFin()
	{
		No last = null;
		No new_last = null;
		corr = ini;
		
		if(ini == fin)
		{
			last = ini;
			ini = null;
			return last.getElem();
		}
		
		
		while(corr != null)
		{
			if(corr.getProx().getProx() == null)
			{
				last = corr.getProx();
				new_last = corr;
				new_last.setProx(null);
				fin = new_last;
				break;
			}
			else
				corr = corr.getProx();
		}
		corr = ini;
		return last.getElem();
	}
	
	public Object prox()
	{
		corr = corr.getProx();
		return corr.getElem();
	}
	
	
	public void posIni()
	{
		if(ini != null)
			corr = ini;
		else
			corr = null;
	}
	
	public void Percorre()
	{
		corr = ini;
		while(corr != null)
		{
			System.out.println(corr.getElem().toString());
			corr = corr.getProx();
		}
		
		corr = ini;
	}
}