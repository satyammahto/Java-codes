package OOPs;

// Parent class
class X {
    int a = 10;

    static void max() {
        System.out.println("Java (Static method)");
    }

    void show()
    {
        System.out.println("This is class X");
    }
}

// Child class
class Y extends X {
    String name = "Satyam";


    void show(int num , String name)
    {
        super.a = num;
        this.name = name;
        System.out.println("This is class Y (Overridden method)");
    }

    @Override
    public void show(){
        System.out.println("THis is class Y");
    }
}

// Main class
public class InheritanceOops {
    public static void main(String[] args) {
        Y y = new Y();

        System.out.println("a: " + y.a);           // Inherited variable
        System.out.println("name: " + y.name);     // Child's variable

        X.max();       // Static method from parent
        y.show(20 , "xyz");      // Overridden method — child version runs
    }
}
