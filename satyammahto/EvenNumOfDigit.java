package satyammahto;

//code for even number of digits in an array
public class EvenNumOfDigit {
	public static void main(String[] args) {
		int[] num={12,345,2,3,7896};
		for(int i=0;i<num.length;i++){
			int count=0;
			int nums=num[i];
		while(nums>0){
			count++;
			nums=nums/10;
		}
		if(count%2==0){
			System.out.println(num[i]);
			}	
		}
	}
}
//for odd number of digits use condition
//count%2!=0