package Practice;

public class maxdiff {
	
	public static void diff(int a[])
	{
		int diff=0;
		for(int i=0;i<a.length-1;i++) {
		if(a[i+1]-a[i]>diff) 
			{
				diff=a[i+1]-a[i];
			}
		}
		System.out.println(diff);
			
		}	
	
	public static void main(String[] args) {
		int a[]= {2,7,8,18,20};
		diff(a);
		
	}

}
