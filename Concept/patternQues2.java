package Concept;

public class patternQues2 {
	public static void main(String args[]) {
		int n = 4;
		for(int row = 1 ; row < n*2 ; row++) {
			int sp = row>n ? row-n : n-row;
			for(int space = 1; space <= sp ; space++) {
				System.out.print(" ");
			}
			int star = row>n ? 2*n-row : row ;
			for(int col = 1 ; col <= star ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//   * 
//  * * 
// * * * 
//* * * * 
// * * * 
//  * * 
//   *