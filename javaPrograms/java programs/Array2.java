class Array2
{
public static void main(String args[])
{
Array2 pets[] = new Array2[5];

for(int i=0;i<5;i++)
{pets[i]=new Array2();//<---- Array Objects are being created here 
System.out.println(pets[i]);
System.out.println(pets[i].toString());
System.out.println(pets[i].hashCode());

}


}
}