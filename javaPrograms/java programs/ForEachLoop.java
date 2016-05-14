class ForEachLoop
{
public static void main(String args[])
{
int a[] = new int[10];
for(int i=0;i<10;i++)
{a[i] = i+1;}


for(int m:a)			//For each loop.... for( variable : obj(of array) ) ...here we can't traverse reverse...
System.out.println(m);	//this loop starts from beginning of array and ends at end...
}
}
