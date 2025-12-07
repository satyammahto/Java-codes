package recursion;

public class Nto1 {
    static void fun(int n){
        if( n==0 ){
            System.out.println();
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
        System.out.print(n + " ");

    }
    static void main(String[] args) {
        fun(5);
    }
}
