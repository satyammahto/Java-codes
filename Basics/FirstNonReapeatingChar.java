package Basics;

public class FirstNonReapeatingChar {

    public static void main(String[] args) {
        String str = "success";
        char arr[] = str.toCharArray();
        boolean isUnique;

        for (int i = 0; i < arr.length; i++) {
           isUnique = true;
            for (int j = i+1; j < arr.length; j++) {
                if (  arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First non-repeating character is: " + arr[i]);
              return;
            }
        }
        System.out.println("All characters are repeating.");
    }
}