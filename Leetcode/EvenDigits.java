package Leetcode;

public class EvenDigits {

	public static void main(String[] args) {
		int[] nums= {18,123,12,1,5,66,79,7568};
		System.out.println(evenDigit(nums));
	}
	
	static int evenDigit(int[] arr) {
		
		int count2=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=0;
			while(num>0) {
				num=num/10;
				count++;
			}
			if(count%2==0) {
				count2++;
				}
			}
		return count2;
	}
}
