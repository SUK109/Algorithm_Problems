import java.lang.*;
public class CTCI1_8 {
	public void is_substring(String a, String b)
	{
		String combine = a+a;
		if(is_rotation(combine,b))
		{
			System.out.println("String is rotation of first string");
		}
		else
		{
			System.out.println("String is not rotation of first string");
		}
		
	}
	public boolean is_rotation(String c,String d)
	{
		boolean result=true;
		int temp=0;
		char e =d.charAt(0);
		if(d.length()>c.length())
		{
			return result=false;
		}
		
		for(int i=0;i<d.length();i++)
		{
			if(c.charAt(i)==e)
				temp = i;
				
				
		}
		for(int i=0;i<d.length();i++)
		{
			
			if(c.charAt(temp)==d.charAt(i))
			{
				temp++;
				result=true;
				
			}
			else
			{
				result=false;
			}
		}
		return result;
	}
	

public static void main(String args[])
	{
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		CTCI1_8 c = new CTCI1_8();
		c.is_substring(str1,str2);
		
	}
}
