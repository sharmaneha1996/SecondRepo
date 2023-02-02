package programs;

public class fibonachi_Series {

	public static void main(String[] args) {
		int a= 0; int b=1;
		System.out.println(a);//0
		System.out.println(b);//1
		int c;
		for(int i=0; i<=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
