
public class _15 {
	
	static boolean OneAway(String str1, String str2)
	{
		boolean oneAway;
		if(str1.length() == str2.length())
			oneAway = OneReplace(str1, str2);
		else if(str1.length() - str2.length()==1)
			oneAway = OneInsert(str2, str1); //lower string first
		else if(str2.length() - str1.length() == 1)
			oneAway = OneInsert(str1, str2);
		else
			return false;
		return oneAway;
	}
	
	static boolean OneReplace(String str1, String str2)
	{
		boolean isReplace = false;
		for(int i=0; i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
				if(isReplace)
					return false;
				else 
					isReplace = true;
		}
		return true;
	}
	
	static boolean OneInsert(String str1, String str2)
	{
		int index1 = 0,index2 = 0;
		boolean flag = false;
		while(index1<str1.length() && index2<str2.length())
		{
			if(str1.charAt(index1)!= str2.charAt(index2))
			{	
				if(flag)
					return false;
				else
				{
					flag = true;
					index2++;
				}
			}
			else
			{
				index1++;
				index2++;
			}
	
		}
		return true;
	}
	
	static boolean OneAway1(String str1, String str2)
	{
		int index1 = 0, index2 = 0;
		boolean flag = false;
		String s1,s2;
		if(str1.length() <= str2.length())
		{
			s1 = str1;
			s2 = str2;
		}
		else
		{
			s1 = str2;
			s2 = str1;
		}
		while(index1<s1.length() && index2<s2.length())
		{
			if(s1.charAt(index1) != s2.charAt(index2))
			{
				if(flag)
				{
					
					return false;
				}
				flag = true;
				if(s1.length() == s2.length())
					index1++;
			}
			else
			{
				index1++;
			}
			index2++;
		}
		return true;
	}
	public static void main(String args[])
	{
		boolean a = OneAway1("pale", "ple");
		System.out.println(a);
		boolean b = OneAway1("pales", "pale");
		System.out.println(b);
		boolean c = OneAway1("pale", "bale");
		System.out.println(c);
		boolean d = OneAway1("pale", "bake");
		System.out.println(d);
	}
}
