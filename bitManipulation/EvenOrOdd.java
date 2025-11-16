package bitManipulation;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 54;
        int result = n & 1;

        if(result == 1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
