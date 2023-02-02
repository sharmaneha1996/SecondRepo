package Practice;

public class Multiply {
	
	public static int mul(int i, int j) {
		
		int sum=0;
		int k=1;
		
		while(k<=j) {
			sum=sum+i;
			k++;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int result= mul(6,10);
		System.out.println(result);

	}

}
