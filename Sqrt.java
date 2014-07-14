package numbers;

public class Sqrt {

	public static void main(String[] args) {

		System.out.println("sqrt of 50: "+ sqrt(50));
		System.out.println("sqrt of  100: "+ sqrt(100));
		System.out.println("sqrt of  2: "+ sqrt(2));
		System.out.println("sqrt of 10: "+ sqrt(10));
	}

	public static double sqrt(double d)
	{
		if(d<0) return -1;

		if(d==0 || d==1) return d;

		double precision = 0.00001;
		double start = 0;
		double end = d;

		if(d<1)
		{
			end =1;
		}
		while(end - start>precision)
		{
			double mid = (start+ end)/2;
			double midSqr = mid* mid;
			if(midSqr ==d)
			{return mid;}
			else if (midSqr<d){ start = mid;}
			else {end= mid;}
		}

		return (start+ end)/2;
	}
}
