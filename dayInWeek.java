package a;

public class dayInWeek {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dayofweek(4, 9, 2014);//dd-mm-yyyy
		dayofweek(3, 9, 2014);//dd-mm-yyyy
		dayofweek(8, 9, 2014);//dd-mm-yyyy
		dayofweek(7, 9, 2014);//dd-mm-yyyy
		dayofweek(13, 11, 1991);//dd-mm-yyyy
				
	}
	
	
	public static void dayofweek(int d, int m, int y)
	{
	    int t[] = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
	    y = y - ( m << 3);
	    int day = ( y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
	    String ans="";
		if(day==0) ans = "Sunday";
		if(day==1) ans = "Monday";
		if(day==2) ans = "Tuesday";
		if(day==3) ans = "Wednesday";
		if(day==4) ans = "Thursday";
		if(day==5) ans = "Friday";
		if(day==6) ans = "Saturday";
		System.out.println(ans);
	}
	 

}
