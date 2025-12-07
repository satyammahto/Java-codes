package recursion;

public class NumReverse {

//    using an extra variable
//    static int sum = 0;
//    static void helper(int n){
//        if(n == 0){
//            return;
//        }
//        sum = sum*10 + (n%10);
//        helper(n/10);
//    }


//  using pure recursion
     static int numRev(int n){
        int digits = ((int)Math.log10(n)) + 1;
        return helper(n , digits);
    }

    private static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10 ;
        return  rem * ((int)Math.pow(10, digits-1)) + helper(n/10, digits-1);
    }

    static void main(String[] args) {
//        helper(1234);
//        System.out.println(sum);
        System.out.println(numRev(8762));
    }
}
