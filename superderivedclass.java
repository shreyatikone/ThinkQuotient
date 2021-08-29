package javaprogram;

class superderivedclass 
 {
	 int b;
	}
	class derived2 extends superderivedclass
	{
		int b;
		void display()
		{
			b=50;
			super.b=5;
			System.out.println("b:"+b);
			System.out.println("super.b:"+super.b);	
		}
	}
	class derived1
	{
		public static void main(String args[])
		{
			derived2 obj=new derived2();
			obj.display();
		}
	}

