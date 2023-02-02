package Practice;

public class MaxofArray {
	
	public static void maxArr(int a[]) {
		int max=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]>a[i]) {
				max=a[i+1];
			}

		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		
int a[]= {2,1,101,100,5};
maxArr(a);
}

}
