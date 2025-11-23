package Basics;

public class Array2D {
	public static void main(String[] args) {
		int arr[][]={
				    {1,2,3,4},
		            {5,6,7},
		            {8,9,10}
		            };
		int target=7;
		for(int row=0;row<arr.length;row++){
		for(int col=0;col<arr[row].length;col++){
			if(target==arr[row][col]){
				System.out.print("Row is and "+row+" ");
				System.out.print("Col is "+col);
			}
		}
		}
	}
}
