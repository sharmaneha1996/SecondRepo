package Practice;

public class DuplicateInArray {
	static int count=0;
	public static void duplic(int a[]) {	
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					System.out.println("Duplicate elements in Array:"+a[j]);
					count++;
				}
				
				
			}
		}
	
		System.out.println("Total number of duplicate elements in Array are:"+count);
	}

	public static void main(String[] args) {
		int a[]= {4,1,2,1,9,9};
		duplic(a);

	}

}
