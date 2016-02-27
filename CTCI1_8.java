import java.lang.*;
public class CTCI1_8 {
	public void is_substring(String a, String b)
	{
		boolean result= true;
		String combine = a + a;
		if(a.length()==b.length() && a.length()>0)
		result = isSubstring(combine,a);
		if(result)
			System.out.println("True");
		else
			System.out.println("False");
		
	}
	 public static boolean isSubstring(String string1, String string2) {
	       if(string2.length()==0)
	    	   return false;
	       else if(string1.toLowerCase().contains(string2.toLowerCase()));
	       	return true;
	       
	    	   
	    }
	

public static void main(String args[])
	{
		String str1 = "abcdef";
		String str2 = "dabc";
		CTCI1_8 c = new CTCI1_8();
		c.is_substring(str1,str2);
		
	}
}
