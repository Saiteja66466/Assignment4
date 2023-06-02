public class PrintDuplicates 
{
	public static void main(String[] args) 
	{
		
		String s1 = "abada";
		char[] ch1 = s1.toCharArray();
		int size = ch1.length;
		
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(ch1[i] == ch1[j])
				{
					System.out.print(ch1[j] + " ");
					break;
				}
			}
		}
	}
}
