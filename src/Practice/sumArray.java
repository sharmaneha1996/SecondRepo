package Practice;

public class sumArray {
	
	public static int sumArr(int a[]) {
		
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
int a[]= {1,2,3,4,5};
System.out.println(sumArr(a));

	}

}
