package satyammahto;

import java.util.*;
public class ArrayInputNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of elements");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter numbers");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("The Array is ");
		System.out.println(Arrays.toString(arr));
		
			}
		}

