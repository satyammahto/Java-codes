package Basics;

public class PatternQ2 {
	public static void main(String[] args) {
	int n=5;
			for(int i=1;i<=5;i++){
			    for(int j=1;j<=i;j++){
			        System.out.print(i);
			    }
			    for(int j=1; j<=n-i;j++){
			    System.out.print(" ");    
			    }
			    System.out.println();
			}
	}
}
//1    
//22   
//333  
//4444 
//55555
