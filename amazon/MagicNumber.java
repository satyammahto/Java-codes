package amazon;

public class MagicNumber {
     public static void main() {
         int number = 6;
         int add=0;
         int base = 5;
         int last;
         while(number>0){
             last = number & 1;
             add = add+last*base;
             base = base*5;
             number = (number >> 1);
         }
         System.out.println(add);
    }
}
