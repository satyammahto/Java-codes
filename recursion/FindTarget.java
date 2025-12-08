package recursion;

public class FindTarget {
    static boolean find(int[] arr, int i, int target){
        if(i ==  arr.length){
            return false;
        }
        return (arr[i] == target) || find(arr, i+1, target);
    }

    static int  findIndex(int[] arr, int i, int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return  findIndex(arr, i+1, target);
    }

    static void main(String[] args) {
        int[] arr = {1,6,3,8,2,9,5};
        System.out.println(find(arr, 0, 5));
        System.out.println(findIndex(arr, 0, 5));
    }
}
