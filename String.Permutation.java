
public class CTCI1_2 {
public boolean string_compare(String str1, String str2){
	if(str1.length()!=str2.length())
			return false;
	
	int[] count = new int[256];
	char[] c = str1.toCharArray();
	for(int i=0;i<c.length;i++)
	{
		int value = c[i];
		count[value]+=1;
	}
	for(int i=0;i<str2.length();i++)
	{
		int value2 = str2.charAt(i);
		count[value2] -= 1;
		if(count[value2]!=0)
			return false;
		
	}
	return true;
	
}
public static void main(String args[]){
	CTCI1_2 c =new CTCI1_2();
	boolean result = c.string_compare("abc","abc");
	if(result)
		System.out.println("correct");
	else
		System.out.println("wrong");
}
}
