
public class _16 {

	static String StringCompression(String str)
	{
		StringBuilder compressed = new StringBuilder();
		int charCount = 0;
		String compressedString;
		for(int i =0; i<str.length();i++)
		{
			charCount++;
			if(i+1 >= str.length() || str.charAt(i)!= str.charAt(i+1))
			{
				compressed.append(str.charAt(i));
				compressed.append(charCount);
				charCount = 0;
			}
			
				
		}
		compressedString = compressed.toString();
		if(str.length() == compressedString.length())
			return str;
		return compressedString;
	}
	public static void main(String args[])
	{
		String str = StringCompression("aabcccccaaa");
		System.out.println(str);
	}
}
