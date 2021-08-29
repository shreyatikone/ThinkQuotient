package javaprogram;

public class animal {
	private String name;
	private String colour;
	private int weight;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour) 
	{
		this.colour=colour;
	}
	public int getWeight()
	{
		return weight;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	static  class wildanimal extends animal{
		
	}
	
	
	public static void main(String args[])
	{
	
	
	wildanimal obj1=new wildanimal();
	obj1.setName("tiger");
	obj1.setColour("yellow");
	obj1.setWeight(200);
	
	System.out.println(obj1.getName());
	System.out.println(obj1.getColour());
	System.out.println(obj1.getWeight());
	}	

}
