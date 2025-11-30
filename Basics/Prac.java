package Basics;

public class Prac{

    static class A{
        static String name;
        public A(String name) {
            A.name = name;
        }
    }

    public static void main(String args[]) {
        A obj = new A("Satyam");
        System.out.println(A.name);
    }
}