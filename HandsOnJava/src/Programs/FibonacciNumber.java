package Programs;

public class FibonacciNumber {

	
	public static void main(String[] args) {
		double s =System.currentTimeMillis();
		for(int i =0;i<38;i++)
	System.out.print("->"+fu(i));
		System.out.println();
		double e =System.currentTimeMillis();
		double w = e-s;
		System.out.println(w/1000+" seconds");

	}
	
	 static int fu(int n)
	{
		if(n ==0)
			return (0); 
		else if(n ==1) 
			return (1);
		else return (fu(n-1)+fu(n-2));
	
	}

}
