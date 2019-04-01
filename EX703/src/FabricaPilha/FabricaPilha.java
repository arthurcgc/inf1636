package FabricaPilha;
import AdapterPilha.AdapterPilha;
import Pilha.Pilha;

public class FabricaPilha {
	public static Pilha cria()
	{
		return new AdapterPilha();
	}
}
