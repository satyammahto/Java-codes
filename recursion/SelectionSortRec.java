package recursion;

import java.util.Arrays;

public class SelectionSortRec {
    static void selectionSort(int[] arr, int row, int col, int maxNumIndex){
        if(row == 0){
            return;
        }
        if(col < row) {
            if (arr[maxNumIndex] < arr[col]) {
                selectionSort(arr, row, col + 1, col);
            } else {
                selectionSort(arr, row, col + 1, maxNumIndex);
            }
        }
        else{
            int temp = arr[maxNumIndex];
            arr[maxNumIndex] = arr[row-1];
            arr[row-1] = temp;
            selectionSort(arr, row-1, 0, 0);
        }
    }

    static void main(String[] args) {
        int[] arr = {1,9,4,77,23};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
