
public class EX0405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voo v = new Voo(10, 4);
		
		
		v.reserva(1, 'A');
		v.reserva(1, 'B');
		v.reserva(4, 'C');
		v.reserva(4, 'D');
		
		v.imprimeMapa();
	}

}
