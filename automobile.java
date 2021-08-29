package javaprogram;

public class automobile {
	
	private int speed;
	private String colour;
	
	public int getSpeed()
	{
		return speed;
	}
	public void setSpeed(int speed)
	{
		this.speed=speed;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	
	
	static class car extends automobile{
		
		
	}
	 static class maruti800 extends car{
		
	}
	
	public static void main(String args[])
	{
	maruti800 obj1=new maruti800();
	obj1.setSpeed(120);
    obj1.setColour("red");
		System.out.println(obj1.getSpeed());
		System.out.println(obj1.getColour());
		System.out.println("this is maruti 800 class");
	}
	
	
	
	}
	


