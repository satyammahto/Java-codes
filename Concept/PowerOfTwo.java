package Concept;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 31;
        if(n==0){
            System.out.println("Exception");
        }
        else{
        boolean ans = (n & (n-1)) == 0;
        System.out.println(ans);
        }
    }
}
