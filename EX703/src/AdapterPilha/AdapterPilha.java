package AdapterPilha;
import Lista.Lista;
import Pilha.Pilha;


public class AdapterPilha extends Lista implements Pilha{

	@Override
	public boolean push(Object x) {
		return insIni(x);
	}

	@Override
	public Object pop() {
		return retIni();
	}
	
}
