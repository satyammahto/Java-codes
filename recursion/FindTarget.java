package recursion;

import java.util.ArrayList;

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

    static ArrayList<Integer> findAllIndex(int[] arr, int i, int target, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        return findAllIndex(arr, i+1, target, list);
    }
//  what if u don't want to pass list in parameter then we can do something like this
    static ArrayList<Integer> findAllIndex(int[] arr, int i, int target){
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr, i+1, target);
        list.addAll(ansFromBelowCalls);

        return list;
    }

    static void main(String[] args) {
        int[] arr = {1, 6, 3, 8, 2, 3, 9, 5};
        System.out.println(find(arr, 0, 5));
        System.out.println(findIndex(arr, 0, 5));

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex(arr, 0, 3));

    }
}
