
public class _14 {

	static boolean PalindromePermutation(String str)
	{
		boolean flag = false;
		int[] a = new int[128];
		for(int i=0;i<str.length();i++)
		{
			int temp = (int) str.charAt(i);
			a[temp]++;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				if(flag)
					return false;
				else
					flag = true;
						
		}
		return true;
	}
	
	static boolean PalindromePermutation1(String str)
	{
		int checkOdd=0;
		int[] a = new int[128];
		for(int i=0;i<str.length();i++)
		{
			
			int temp  = (int) str.charAt(i);
			
			a[temp]++;
			if(a[temp]%2!=0)
			{
				checkOdd++;
			}
			else
			{
				checkOdd--;
			}
		}
		return checkOdd<=1;
	}
	
	public static void main(String args[])
	{
		boolean a = PalindromePermutation("tactcoa");
		boolean b = PalindromePermutation("tactcoa");
		System.out.println(a);
		System.out.println(b);
	}
}
