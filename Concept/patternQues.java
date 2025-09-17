package Concept;

public class patternQues {
	public static void main(String args[]) {
		int n = 5;
		for(int row = 1 ; row < n*2 ; row++) {
			int star = row>n ? 2*n-row : row ;
			for(int col = 1 ; col <= star ; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//*