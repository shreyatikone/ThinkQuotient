package javaprogram;

public class staticvariable
{
int rollno;
String name;
static String college ="abc";
staticvariable(int r, String n)
{
	rollno=r;
	name=n;
}
void display()
{
	System.out.println(rollno+""+name+""+college);
}
public class TestStaticVariable1
{
	public void main(String args[])
	{
	staticvariable s1 = new staticvariable(5,"xyz");
	staticvariable s2 = new staticvariable(9,"pqr");
	s1.display();
	s2.display();
	}
}
}


	
	
