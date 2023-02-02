package Practice;

public class MulWithoutStar {
	
	public static int mul(int m,int n) {
		int sum=0;
		int k=1;
		
		
		while(k<=n) {
			sum=sum+m;//5
			k++;
		}
	
		return sum;
	}

	public static void main(String[] args) {		
		int result=mul(5,10);
		System.out.println(result);

	}
	
	

}
