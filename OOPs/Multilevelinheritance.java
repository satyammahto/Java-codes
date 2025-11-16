package OOPs;

class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class Multilevelinheritance {
		
	    public static void main(String[] args) {
	        Puppy p = new Puppy();
	        p.speak();  // From Animal
	        p.bark();   // From Dog
	        p.weep();   // From Puppy
	    }
	}