package Abstraction;

public abstract class Animal {
		//sb animals ka behaviour same hota h islie 4legs
		void legs() 
		{
			System.out.print("All animals have 4 legs");
		}
		//here all animals have diffrent sounds
		//and here we dont we are talking about which animal so make it abstract we cannot 
		// define this method
		
//		void sound() 
//		{
//			System.out.println();
//		}
//		make it like this
		abstract void sound(); //and when make this make class an abstract class
		abstract void eat(); //this will also vary animal to animal
		
	}

	class Dog extends Animal
	{
		@Override 
		void sound()
		{
			System.out.println("Bhow Bhow");
		}
		void eat()
		{
			System.out.println("Meat eating");
		}
	}

	class Cow extends Animal
	{
		@Override
		void sound()
		{
			System.out.println("Mow Mow...");
		}
		void eat()
		{
			System.out.println("Grass Eating...");
		}
	}

 class absClass45 
	{
		public static void main(String[] args) {
			//now make objects
			Dog d = new Dog();
			Cow c = new Cow();
			
			d.sound(); d.eat(); d.legs();
			c.sound(); c.eat(); c.legs();
			
		}
	}


