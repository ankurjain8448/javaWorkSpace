package Programs;

public class FibonacciArray {

	public static void main(String[] args) {
		int n  = 10;
		//int a[] = new int[n];
		int a = 0;
		int b = 1;
		System.out.print(a+"->"+b+"->");
		for(int i=2;i<n;i++)
		{
			int c =  a + b ;
			System.out.println(c);
			int temp = b;
			b=c;
			a=temp;
			
		}

	}

}
