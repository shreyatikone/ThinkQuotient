package javaprogram;

public class mobile {
private String company;
private int price;
public mobile(String pcompany)
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
	public mobile(int sprice)
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
	
	
	public static void main(String[]args)
	{
	mobile obj1=new mobile("redmi");
	mobile obj2=new mobile(20000);
	System.out.println(obj1.getCompany());
	System.out.println(obj2.getPrice());
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


