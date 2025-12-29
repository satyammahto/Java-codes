package Sorting;
import java.util.Arrays;

public class QuickSort {
static void sort(int[] arr, int low, int high){
    if(low >= high){
        return;
    }
    int st = low;
    int end = high;
    int mid = st + (end - st)/2;
    int pivot = arr[mid];

    while(st <= end){

        while(arr[st] < pivot){
            st++;
        }
        while(arr[end] > pivot){
            end--;
        }

        if(st <= end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    sort(arr, low, end);
    sort(arr, st, high);
}
static void main(String[] args) {
    int[] arr = {60,33,10,90,20};
    sort(arr, 0, arr.length-1);
    System.out.println(Arrays.toString(arr));
    }
}
