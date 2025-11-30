package OOPs;

public class ObjectClass {
    int id;

    ObjectClass(int id){
        this.id = id;
    }
    public ObjectClass() {
        super();
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        ObjectClass s = (ObjectClass) obj;
        return this.id == s.id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Obj is printed";
    }

//    @Override
//    protected void finalize() throws Throwable {
//       super.finalize();
//   }

    static void main(String[] args) {
        ObjectClass obj = new ObjectClass(1);
        ObjectClass obj1 = new ObjectClass(2);

        System.out.println(obj);

        System.out.println(obj.equals(obj1));
    }
}
