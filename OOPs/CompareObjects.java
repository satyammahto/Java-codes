package OOPs;

import java.util.Arrays;


public class CompareObjects implements Comparable<CompareObjects> {
    int num ;
    float marks;

    public CompareObjects(int num, float marks) {
        this.num = num;
        this.marks = marks;
    }

    @Override
    public int compareTo(CompareObjects o) {
        return (int)(this.marks - o.marks);
    }

    @Override
    public String toString() {
        return marks + " & " + num;
    }

    static void main(String[] args) {
        CompareObjects obj1 = new CompareObjects(6, 92.8f);
        CompareObjects obj2 = new CompareObjects(8, 85.2f);
        CompareObjects obj3 = new CompareObjects(4, 98.5f);
        CompareObjects obj4 = new CompareObjects(10, 76.3f);

        CompareObjects[] obj = {obj1 ,obj2 ,obj3, obj4};

//        if(obj1.compareTo(obj2) < 0){
//            System.out.println("Obj2 is Greater.");
//        }else{
//            System.out.println("Onj1 is Greater");
//        }
        System.out.println(Arrays.toString(obj));
        Arrays.sort(obj);
        System.out.println(Arrays.toString(obj));

    }
}
