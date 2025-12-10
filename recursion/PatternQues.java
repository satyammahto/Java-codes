package recursion;

public class PatternQues {
    static void star1(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            star1(row, col+1);
            System.out.print("* ");
        }
        else{
            star1(row-1, 0);
            System.out.println();
        }
    }

    static void star2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("* ");
            star2(row, col+1);
        }
        else{
            System.out.println();
            star2(row-1, 0);
        }
    }
    static void main(String[] args) {
        System.out.println("Pattern 1");
        star1(4,0);
        System.out.println("\nPattern 2\n");
        star2(4,0);
    }
}
