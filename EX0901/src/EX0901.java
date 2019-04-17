import erro.ErroGeral;
import erro.SalarioZerado;

public class EX0901 {
	public static void main(String[] args) throws SalarioZerado, ErroGeral {
		Contribuinte []lst;
		
		lst=Contribuinte.listaContr();
		
		System.out.printf("NOME                       IMPOSTO\n");
		System.out.printf("====================       =======\n\n");
		
		for(Contribuinte c:lst) {
			System.out.printf("%-20s     %9.2f\n",c.getNome(),c.calcImposto());
		}
	}
}
