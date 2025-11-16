package Concept;

public class NoOfBits {
      public static void main() {
            int num=500;
            int base=2;
            int count=0;
            while(num > base){
                count++;
                base=base*2;
            }
            System.out.println(count+1);
    }
}
