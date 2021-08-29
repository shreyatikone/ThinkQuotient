package javaprogram;
public class car
{
	 int speed;
	 int gears;
 String color;
public int getSpeed()
{
	return speed;
}
public void setSpeed(int speed)
{
this.speed=speed;
}	
public int getGears()
{
	return gears;
}
public void setGears(int gears)
{
	this.gears=gears;
}
public String getColor()
{
	return color;
}
public void setColor(String color)
{
	this.color=color;
}

public static void main(String args[])
{
	car car1=new car();
	car1.setSpeed(100);
	car1.setGears(5);
	car1.setColor("black");
	
	System.out.println(car1.getSpeed());
	System.out.println(car1.getColor());
	System.out.println(car1.getGears());
	
}
}



