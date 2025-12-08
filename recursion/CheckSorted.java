package recursion;

public class CheckSorted {
    static boolean sorted(int[] arr, int i){
        if(i == arr.length){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr, i+1);
    }
    static void main(String[] args) {
        int[] arr = {1,2,3,4,7,9};
        System.out.println(sorted(arr, 0));
    }
}
