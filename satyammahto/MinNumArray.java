package satyammahto;

public class MinNumArray {
	public static void main(String[] args) {
		int num[]={2,4,5,6,7};
		int min=num[0];
		for(int i=1;i<num.length;i++){
			if(min<num[i]){//for max num max>arr[i]
			min=num[i];	
			}
		}System.out.println(min);
	}
}