package DSA;
public class Heap {
	public static void main(String[] args){
		
		int a[] = {16,14,10,88,7,9,9,2,4,1};
	
		A1 obj = new A1();	
			
		/*a = obj.min_heap(a);
		a = obj.max_heap(a);
		a = obj.MAX_HEAPIFY(a, 1);
		a = obj.MIN_HEAPIFY(a, 1);*/
		a = obj.heapSort(a);
		
		for(int  p = 0;p<a.length;p++)
			System.out.println(a[p]);			
	}
}

class A1{
	static int largest ;
	static int smallest;
	static int l;
	static int r;
	static int temp;
	static int heap_size = 10;
	
	int[] heapSort(int a[])
	{
		a = max_heap(a);
		for(int i = heap_size;i>0;i--)
		{
			a= exchange(a,0,i-1);
			heap_size = heap_size-1;
			MAX_HEAPIFY(a,0);
		}
		
		return a;
	}
	
	
	int[] max_heap(int a[])
	{
		
		for(int i=heap_size/2 ; i>=0 ; i-- )
		       a = 	MAX_HEAPIFY(a,i);
		
		return a;
	}
	
	int[] MAX_HEAPIFY(int a[],int i)
	{
		
		l = left(i);
        r = right(i);
	
		if( (l<heap_size)&&(a[l]>a[i]) )	largest = l;
		else largest = i;
		
		if( (r<heap_size)&&(a[r]>a[largest]) ) largest = r;

		if(largest!=i) 
		{
			a = exchange(a,i,largest);
			a=	MAX_HEAPIFY(a,largest);
		}
		return a;
	}
	
	int[] exchange(int a[],int i,int j)
	{
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		return a;		
	}
	
	
	int[] MIN_HEAPIFY(int a[],int i)
	{
		
		l= left(i);
		r = right(i);
		if( (l<=9)&&(a[l]<a[i]) ) smallest = l;
		else smallest = i;
		
		if( (r<=9)&&(a[r]<a[smallest])) smallest  = r;
		
		if(smallest!=i)
		{
			a = exchange(a,i,smallest);
			a = MIN_HEAPIFY(a,smallest);
		}
				
		
		return a;
	}
	
	int left(int i)
	{return 2*i +1;	}
	
	int right(int i)
	{return 2*i+2;}
	
	
	
	
	int[] min_heap(int a[])
	{
		for(int i=heap_size/2 ; i>=0 ; i-- )
		{
		       a = 	MIN_HEAPIFY(a,i);
		}
		return a;
	}
	
	
}