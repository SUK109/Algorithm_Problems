
public class CTCI1_5 {
public void count_char(String str){
	String mystr = "";
	StringBuffer sb = new StringBuffer(mystr);
	char last = str.charAt(0);
	int count = 1;
	for (int i = 1; i < str.length(); i++) {
	 if (str.charAt(i) == last) { // Found repeat char
	 count++;
	 } 
	 else { // Insert char count, and update last char
	 sb.append(last);
	 sb.append(count);
	
	 last = str.charAt(i);
	 count = 1;
	 }
	}
	System.out.println(sb+""+last+""+count);
}
	 
public static void main(String args[])
{
	CTCI1_5 c = new CTCI1_5();
	c.count_char("aaaaaaaccbbaasscc");
}
}
