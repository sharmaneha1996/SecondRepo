package programs;

import java.util.Scanner;

public class prime {
	
	public static boolean isPrime(int num) {
		 if(num<=1)
			 return false;
		 for(int i=2;i<num;i++) {
			 if(num%i==0) 
				 return false;
		 }
			
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(11));
	}

}
