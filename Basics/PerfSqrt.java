package satyammahto;

public class PerfSqrt {
	public static void main(String[] args) {
		int p[]={1,3,7,9,49,77,81};
		for(int i=0;i<p.length;i++){
			int num=p[i];
			int sqrtVal=(int)Math.sqrt(num);
			if(sqrtVal*sqrtVal==num){
			System.out.println(num);	
			}
		}
	}
}
