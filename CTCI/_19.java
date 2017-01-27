
public class _19 {

	static boolean CheckSubString(String s1, String s2)
	{
		if(s1.length()!= s2.length())
			return false;
		String s = s1+s1;
		boolean a = IsSubString(s, s2);
		return a;
	}
	
	static boolean IsSubString(String s1, String s2)
	{
		boolean flag = false;
		int index = 0;
		for(int i=0;i<s2.length();i++)
		{
			
			if(s2.charAt(i)== s1.charAt(index))
			{
				flag = true;
			}
			else
			{
				flag = false;
				i=0;
			}
			index++;
		}
		return flag;
	}
	public static void main(String args[])
	{
		boolean a = CheckSubString("waterbottle", "erbottlewat");
		System.out.println(a);
	}
}
