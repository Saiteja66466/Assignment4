public class RemoveDuplicates
{
	public static void main(String[] args) 
	{
	
		String s1 = "abaccd";
		String answer ="";
		char[] ch = s1.toCharArray();
		int size = ch.length;
		
		int i,j;
		for(i=0; i<size; i++)
		{
			for(j=0; j<i; j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
			}
			
			if(j==i) {
				answer += ch[i];
			}
		}
		System.out.println(answer);
	}
}