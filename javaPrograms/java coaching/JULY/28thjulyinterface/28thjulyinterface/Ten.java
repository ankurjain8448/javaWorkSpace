interface TV
{
void switchOn();
void switchOff();
void changeChannel();
}


class Samsung implements TV
{
public void switchOn()
{
System.out.println("Samsung TV is being switched on");
}

public void switchOff()
{
System.out.println("Samsung TV is being switched off");
}

public void changeChannel()
{
System.out.println("Samsung TV's channel is being changed ");
}

}


class LG implements TV
{
public void switchOn()
{
System.out.println("LG TV is being switched on");
}

public void switchOff()
{
System.out.println("LG TV is being switched off");
}

public void changeChannel()
{
System.out.println("LG TV's channel is being changed ");
}

}


class Ten
{
public static void main(String args[])
{
TV tv1=new Samsung();
tv1.switchOn();
tv1.switchOff();
tv1.changeChannel();

TV tv2=new LG();
tv2.switchOn();
tv2.switchOff();
tv2.changeChannel();

}

}

