package Programs;
import java.util.*;

public class RegulaFalsi {

	
	public static void main(String[] args) {
	 Regula a = new Regula();
	a.cal();
	}

}


class Regula
{
	Scanner in = new Scanner(System.in);
	void cal()
	{ 
		System.out.println("Enter the no : ");
		double n =in.nextDouble();
		//double e = 0.0001;
		double i=1;
		for( i = 1; i*i<=n ; i = i+1)
		{}
		System.out.println("square root : "+i);
	}
	
	/*private double mod(double d) {
		if(d<0)
			return(-d);
		else 
			return d;
	}*/

	
}