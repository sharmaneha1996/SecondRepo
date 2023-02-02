package Practice;

import java.util.ArrayList;

public class CompareTwoArrays {

	public static void Compare(int a[], int b[]) {
		ArrayList<Integer>al= new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					al.add(a[i]);
				}
				
			}
			
		}
		
		for (Integer integer : al) {
			System.err.println(integer);
		}
		
		
	}
	
	 
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {1,2,9,3,9};
	Compare(a,b);

	}

}
