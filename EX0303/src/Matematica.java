
public class Matematica 
{
	public static double pi(double n)
	{
		double sum = 0;
		double multiplier = -1;
		for(double i=0; i<n; i++)
		{
			// sum += Math.pow(-1.0,i + 1.0)/((2.0*i) - 1);
			sum +=  ((1.0/(2.0*i - 1)) * multiplier);
			multiplier*=-1;
		}
		sum = 1 - sum;
		
		return (-4*sum);
	}
	
	
	
}
