package Practice;

public class MinofArray {
	
	public static int minOfArr(int a[]) {
	int min=0;
		for(int i=0; i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				min=a[i+1];
			}
		}
		
		return min;
		
	}

	public static void main(String[] args) {
		int a[]= { 5,8,9,10};
		System.out.println(minOfArr(a));

	}

}
