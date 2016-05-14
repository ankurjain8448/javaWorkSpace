package Programs;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		for(int n = 0;n<i;n++)
		{double a = (1+Math.sqrt(5))/2;
		double b = (1-Math.sqrt(5))/2;
		double a1 = Math.pow(a, n);
		double b1 = Math.pow(b, n);
		double t = a1 - b1;
		t= t/Math.sqrt(5);
		int p=(int)t;
				System.out.println(p);
		}
		
		
		
	}

}
