package programs;

public class Reverse_Number {
	
	

	public static void main(String[] args) {
		int rev = 0,rem=0;
				
	int num=123;
	while(num!=0) {
		rem= num%10;
		rev= rev*10+rem;
		num=num/10;
		
	}
	System.out.println(rev);

	}

}