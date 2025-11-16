package Concept;

public class SumOfNthRow_PascalTri {
    public static void main(String[] args) {
        int row=4;
        int ans = 1<<(row-1); //why row-1 bcoz we start from 0 in left shift
        System.out.println(ans);
    }
}
