package Practice;

public class MaxDiffInArray {
	
	public static void MaxDiff(int a[]) {	
		int diff=0;
		for (int i=0;i<a.length-1;i++) {
			if(a[i+1] - a[i]>diff) {
			diff=a[i+1] - a[i];
			}
		}
		System.out.println(diff);
	}
	public static void main(String[] args) {
		int a[]= {2,5,8,10,15};
		MaxDiff(a);
	}
}
