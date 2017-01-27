
public class _12 {

	static boolean isPalindrome(String s1, String s2)
	{
		
		int[] c = new int[128];
		if(s1.length() != s2.length())
		{
			return false;
		}
		for(int i=0;i<s1.length();i++)
		{
			int temp = s1.charAt(i);
			c[temp] = c[temp] + 1;
		}
		for(int i=0;i<s2.length();i++)
		{
			int temp1 = s2.charAt(i);
			c[temp1] = c[temp1] - 1;
			if(c[temp1] == -1)
				return false;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		boolean a = isPalindrome("abcde", "bcdvea");
		System.out.println(a);
	}
}
