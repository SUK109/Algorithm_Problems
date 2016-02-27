import java.util.*;

public class CTCI1_2_2 {
public String sort(String str){
	char[] content = str.toCharArray();
	Arrays.sort(content);
	return new String(content);
}

public boolean permutation(String str1, String str2){
	if(str1.length()!=str2.length())
		return false;
	return sort(str1).equals(sort(str2));
}
public static void main(String args[]){
	CTCI1_2_2 c = new CTCI1_2_2();
	boolean result= c.permutation("abc", "bac");
	if(result)
		System.out.println("correct");
	else
		System.out.println("Wrong");
}
}
