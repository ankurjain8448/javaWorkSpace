package xtra;
import java.util.ArrayList;

public class ArrayLists {
//insertion in O(n)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> myLists  = new ArrayList<Integer>();
		myLists.add(12);
		myLists.add(12);
		myLists.add(12);
		myLists.add(12);
		
		 int size = myLists.size();
		 System.out.println(size);
		 myLists.remove(15);
		 System.out.println(size);
	}

}
