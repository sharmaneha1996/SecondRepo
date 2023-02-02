package Practice;

public class MultiplyWithoutUisngStartOperator {
	
	
	public static int mul(int i, int j) {
		
		int k=1;
		int sum=0;
		
		while(k<=j) {
			sum=sum+i;
		k++;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		int result=(mul(5,10));
		System.out.println(result);

	}

}
