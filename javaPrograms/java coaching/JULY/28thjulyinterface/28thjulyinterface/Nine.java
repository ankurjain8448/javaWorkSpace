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


class Nine
{
public static void main(String args[])
{
Samsung plano=new Samsung();
plano.switchOn();
plano.switchOff();
plano.changeChannel();

LG goldenEye=new LG();
goldenEye.switchOn();
goldenEye.switchOff();
goldenEye.changeChannel();

}

}

