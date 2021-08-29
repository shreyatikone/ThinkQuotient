package javaprogram;

abstract class ooiabstractanimal {
abstract public void bark();
		public void skin()
		{
			System.out.println("skin color to be given");
		}
	}
	class dog extends ooiabstractanimal
	{
		public void bark()
		{
			System.out.println(" bow bow");
		}
	}
	class cat extends ooiabstractanimal
	{
		public void bark()
		{
			System.out.println("meow meow");
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ooiabstractanimal animal2=new dog();
			ooiabstractanimal animal4=new cat();
			ooiabstractanimal[] animal= {new dog(),new cat()};
			animal[0].bark();
			animal[1].bark();
            animal[0].skin();
            
		}

	}



