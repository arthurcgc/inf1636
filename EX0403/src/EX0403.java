public class EX0403
{
	public static void main(String[] args) 
	{
		Vetor v = new Vetor(1,2);
		Vetor c = v.clone();
		System.out.println(c.toString());
	}
}