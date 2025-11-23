package Basics;

// Parent class
class X {
    int a = 10;

    static void max() {
        System.out.println("Java (Static method)");
    }

    void show() {
        System.out.println("This is class X");
    }
}

// Child class
class Y extends X {
    String name = "Satyam";

    @Override
    void show() {
        System.out.println("This is class Y (Overridden method)");
    }
}

// Main class
public class InheritanceOops {
    public static void main(String[] args) {
        Y y = new Y();

        System.out.println("a: " + y.a);           // Inherited variable
        System.out.println("name: " + y.name);     // Child's variable

        X.max();       // Static method from parent
        y.show();      // Overridden method — child version runs
    }
}
