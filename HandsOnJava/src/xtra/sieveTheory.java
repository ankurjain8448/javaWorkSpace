package xtra;

public class sieveTheory {

		public static void main(String[] args) {
			
			System.out.println("Sieve Theory");
			int MAX = 101;
			boolean arr[] = new boolean[MAX];
			
			arr[0] = arr[1] = true;
			int index = 2;
			
			int sqrt = (int)Math.sqrt(MAX);
			
			while(index<=sqrt)
			{
				while(arr[index]!=false) index++;
				int temp = 2*index;
				while(temp<MAX)
					{
						arr[temp] = true;
						temp = temp + index;
					}
				index++;
			}

	}

}
