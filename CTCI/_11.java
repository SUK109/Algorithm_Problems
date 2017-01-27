
public class _11 {

	static boolean isUnique(String str)
	{
		boolean[] check = new boolean[128];
		for(int i=0;i<str.length();i++)
		{
			int num = str.charAt(i);
			if(check[num])
			{
				return false;
			}
			else
			{
				check[num] = true;
			}
		}
		return true;
	}
	
	public static void main(String args[])
	{
		boolean a = isUnique("abcd");
		System.out.println("output of abcd"+a);
		boolean b = isUnique("aa");
		System.out.println("output of aaa"+b);
		
	}
}
