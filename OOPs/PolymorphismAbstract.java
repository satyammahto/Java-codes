package OOPs;

abstract class Anima {
 abstract void sound();  // abstract method

 void sleep()
 {
     System.out.println("Animal is sleeping");
 }
}

class Donkey extends Anima {
 void sound()
 {
     System.out.println("dha chu dha chu");
 }
}

class Cat extends Anima {
 void sound()
 {
     System.out.println("Cat meows");
 }
}

public class PolymorphismAbstract {
	public static void main(String[] args) {
		  Anima a;
		     a = new Donkey();  // Base class reference → Dog object
		     a.sound();      // Calls Dog's version of sound()
		     a.sleep();      // Inherited method from Animal

		     a = new Cat();  // Base class reference → Cat object
		     a.sound();      // Calls Cat's version of sound()
		     a.sleep();      // Still works
	}
}
