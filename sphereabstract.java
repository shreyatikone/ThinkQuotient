package javaprogram;
import java.util.*;
abstract class sphereabstract
{
double radius;
final double pi=3.14;
abstract void findarea();
abstract void findvolume();
void display()
{
	System.out.println("this is an abstract class");
}
}
 class sphere extends sphereabstract
{
	Double area;
	Scanner sc = new Scanner(System.in);
	void findarea()
	{
		System.out.println("enter radius of sphere");
		radius=sc.nextDouble();
		area=4*pi*radius*radius;
		System.out.println("area of sphere is:"+area);
		
	}
	void findvolume()
	{
		System.out.println("enter radius of sphere:");
		radius = sc.nextDouble();
		area = (4/3)*pi*(radius*radius*radius);
		System.out.println("volume of sphere is:"+area);
	}
}
class Exabstract
{
	public static void main(String args[])
	{
		sphere s = new sphere();
		s.display();
		s.findarea();
		s.findvolume();
	}
	}

