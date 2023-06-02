public class Program4
{
	public static void main(String[] args) 
	{
		String s1 = "jabca123#$%^&";
		s1 = s1.toLowerCase();
		int size = s1.length();
		int vowels = 0;
		int consonants = 0;
		int specialCharacters = 0;
		
		for(int i=0; i<size; i++)
		{
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
			{
				vowels ++;
			}
			else if(s1.charAt(i) >= 32 && s1.charAt(i) <= 47)
			{
				specialCharacters++;
			}
			else if(s1.charAt(i)>= 'a' && s1.charAt(i) < 'z')
			{
				consonants++;
			}
		}
		
		System.out.println(consonants);
		System.out.println(vowels);
		System.out.println(specialCharacters);
	}
}