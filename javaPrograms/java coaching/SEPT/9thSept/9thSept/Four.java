class A
{
}

class Four
{
public static void main(String args[])
{
/*
A obj1=new A();
A obj2=new A();
System.out.println(obj1==obj2);
*/

/*
String name1="Vishnu";
String name2="Vishnu";
System.out.println(name1==name2);

String name1="Vishnu";
String name2="vishnu";
System.out.println(name1==name2);
*/


String name1="Vishnu";
String name2="Vishnu";


//System.out.println(name1==name2);

String name3=new String("Vishnu");
//System.out.println(name1==name3);


String name4=new String("Vishnu");
//System.out.println(name3==name4);

String name5=name4.intern();

//System.out.println(name1==name5);


String name6="Vish"+"nu";
//System.out.println(name1==name6);

String name7="Vish";
String name8=name7+"nu";
System.out.println(name1==name8);

System.out.println("Hem".intern());

}

}
