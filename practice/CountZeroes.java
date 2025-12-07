package practice;

public class CountZeroes {

    static int countZero(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int count){
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            count++;
        }
        return helper(n/10, count);
    }
    static void main(String[] args) {
        System.out.println(countZero(30204000));
    }
}
