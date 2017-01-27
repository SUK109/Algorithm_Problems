
public class _13 {

	static void RemoveSpace(char[] str, int trueLength)
	{
		int spaceCount = 0;
		int index;
		for( char a : str)
		{
			if(a==' ')
			 spaceCount += 1;
		}
		index = trueLength + spaceCount *2;
		if(str.length > trueLength)
		{
			str[trueLength] = '\0';
		}
		for(int i = trueLength; i>=0; i--)
		{
			if(str[i] == ' ')
			{
				str[index -1] = '0';
				str[index -2] = '2';
				str[index -3] = '%';
				index = index -3;
			}
			else
			{
				str[index - 1] = str[i];
				index = index -1;
			}
		}
			
	}
}
