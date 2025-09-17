package satyammahto;

import java.util.*;
public class StringToArray {
	public static void main(String[] args) {
//		if string contains a line then use .split() otherwise use .toCharArray
//		String str="We are learning java";
//		String st[]=str.split(" ");
//		for(int i=0;i<st.length;i++){
//			System.out.println(st[i]);
//		}
		String name="Satyam";
		char[] arr=name.toCharArray();
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
