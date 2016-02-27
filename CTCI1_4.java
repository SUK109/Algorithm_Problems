
public class CTCI1_4 {
public void remove_space(String str){
	char[] content = str.toCharArray();
	int length = str.length();
	int spacecount=0,newlength,i;
	for(i=0;i<length;i++)
	{
		if(content[i] == ' ')
		{
			spacecount++;
		}
		
	}
	newlength = length + spacecount*2;
	char[] c1 = new char[newlength];
	int j=0;
	for(i=0;i<content.length;++i)
	{
		if(content[i]==' ')
		{
			c1[j] = '%';
			c1[j+1] = '2';
			c1[j+2] = '0';
			j=j+3;
		}
		else
		{
			c1[j] = content[i];
			j=j+1;
		}
	}
	String result = new String(c1);
	System.out.println(result);
	
	
}

}
