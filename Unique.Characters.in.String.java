public class CTCI1_1 {
public boolean checkunique(String str){
	if(str.length()>256) return false;
	boolean[] bl = new boolean[256];
	
	for(int i=0;i<str.length();i++)
	{
		int value = str.charAt(i);
		if(bl[value])
		{
			return false;
		}
		else{
		bl[value]=true;
		}
	}
	return true;
}
public static void main(String args[])
{
	CTCI1_1 c1 = new CTCI1_1();
	boolean result = c1.checkunique("University of Texas ar Dallas");
	if(result)
		System.out.println("All characters in the string are unique");
	else
		System.out.println("String contains dublicate characters");
}
}
