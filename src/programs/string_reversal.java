package programs;

public class string_reversal {
	
	public static String rev(String s) {
		String rev="";
		int len=s.length();
		
		for (int i=len-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		return rev;
	}
	

	

	public static void main(String[] args) {
		rev("Selenium");
		
	}

}
