import java.io.*;

class Employee implements Serializable
{
private String name;
private Car car;

Employee(String name,Car car)
{
this.name=name;
this.car=car;
}

public Car getCar()
{
return car;
}

public String getName()
{
return name;
}



}
