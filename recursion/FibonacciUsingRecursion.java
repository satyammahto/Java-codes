package recursion;

public class FibonacciUsingRecursion {
	
	static int fibo(int n) { //function initialization
		//base condition
		if(n < 2) {
			return n;
		}	
		return fibo(n-1) + fibo(n-2); //recursive call
	}

	public static void main(String[] args) {
		System.out.println(fibo(6));
	}
}
