package lista;

public class main {

	public static void main(String[] args) {
		Lista l = new Lista();
		
		System.out.println(l.vazio());
		
		for(int i = 0; i <= 100; i++)
			l.insIni(new Vetor(i, i*2));
		
		System.out.println("Inicio: " + l.retIni().toString());
		System.out.println("tam = " + l.getTam());
		l.Percorre();
		System.out.println(l.vazio());
		System.out.println("Fim: " + l.retFin().toString());
	}

}
