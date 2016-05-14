import java.io.*;

class Company implements Serializable
{

private String name;
private Employee e;

Company(String name,Employee e)
{
this.name=name;
this.e=e;
}

public Employee getEmployee()
{
return e;
}

public String getName()
{
return name;
}

}
