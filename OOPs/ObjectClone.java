package OOPs;

import java.util.Arrays;

//Use When u have to Clone bigger objects like Arrays and stuff
public class ObjectClone implements Cloneable{
    int age;
    String name;
    int[] arr;

    public ObjectClone(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 1, 9};
    }

//  Add "throws Exception' in front of method where that function might throw an exception
    @Override
    protected Object clone() throws CloneNotSupportedException {
//      This is shallow copy -> primitives ke liye new variable create karke value copy krta hai but for non primitives it just point to the original object
        return super.clone();
    }

    static void main(String[] args) throws CloneNotSupportedException{
        ObjectClone kunal = new ObjectClone(23, "Kunal");
        ObjectClone twin = (ObjectClone) kunal.clone();

        System.out.println(twin.name + " " + twin.age);

        twin.arr[0] = 100;//Original array means kunal one's will also change that's why shallow copy

        System.out.println(Arrays.toString(kunal.arr));

    }
}
