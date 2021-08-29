package javaprogram;

public class fan {
	private String company;
	private int price;
	private String colour;
	public  fan(String pcompany)
	{
		this.company=pcompany;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	 public  fan(int sprice)
	{
		this.price=sprice;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void Fan(String rcolour)
	{
		this.colour=rcolour;
	}
	
	public String getColour()
	{
		return colour;
	}
	public void setColour(String colour)
	{
		this.colour=colour;
	}
	


public static void main(String args[]) {
	fan obj1=new fan("crompton");
	 fan obj2 =new fan(2000);
	 fan obj3 =new fan("white");
	System.out.println( obj1.getCompany());
	System.out.println(obj2.getPrice());
	System.out.println(obj2.getColour());
	
	
}
}

