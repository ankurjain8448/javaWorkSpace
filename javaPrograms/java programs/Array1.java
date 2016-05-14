
class goodDog
{

private int size;

public int getSize()
{
return size ;
}

public void setSize(int s)
{
size = s ;
}

void bark()
{
if(size>60)
System.out.println("greater than 60");
else
System.out.println("less than 60");
}
}


class Array1
{
public static void main(String args[])
{

goodDog one = new goodDog();
one.setSize(40);

goodDog tone = new goodDog();
tone.setSize(70);

System.out.println("dog one =" + one.getSize());
System.out.println("dog tone =" + tone.getSize());

one.bark();
tone.bark();
}
}