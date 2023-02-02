package programs;

public class facto_without_recursion {
	
	public int factorial(int num) {
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		facto_without_recursion obj= new facto_without_recursion();
		System.out.println(obj.factorial(5));
		
	}

}
