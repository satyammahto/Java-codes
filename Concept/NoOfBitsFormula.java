package Concept;

public class NoOfBitsFormula {
    public static void main() {
        int num = 10;
        int base = 8;

        int ans = (int)(Math.log(num) / Math.log(base));
        System.out.println(ans+1);
    }
}
