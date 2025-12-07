package Leetcode;
//Ques no 1342 of

//can also be solved by while loop but i just want to use recursion
public class StepCount {
    static int count(int n){
        return helper(n, 0);
    }
    static int helper(int n, int steps){
        //base condition
        if(n == 0){
            return steps;
        }
        if(n%2 == 0){
            return helper(n/2, steps+1);
        }
        return helper(n-1, steps+1);
    }

    static void main(String[] args) {
        System.out.println(count(8));
    }
}
