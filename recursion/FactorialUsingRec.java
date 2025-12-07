package recursion;

public class FactorialUsingRec {
//    considering that only positive number will be entered
    static long fact(int n){
        if(n < 2){
            return n;
        }
        return n*fact(n-1);
    }
    static void main(String[] args) {
        System.out.println(fact(18));
    }
}
