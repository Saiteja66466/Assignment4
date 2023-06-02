public class Pangram
{
	public static void main(String[] args) 
	{
		String s1 = "The Quick Brown Fox Jumps over a Lazy Dog";
		boolean flag = false;
		s1 = s1.replace(" ", "");
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)>= 'a') {
				s2 = s2 + (char)(s1.charAt(i)-32);
			}
			else {
				s2 = s2 + s1.charAt(i);
			}
		}
		
		char[] ch = new char[s2.length()];
		for(int i=0; i<ch.length; i++) {
			ch[i] = s2.charAt(i);
		}
		
		int[] ar = new int[26];
		for(int i=0; i<ch.length; i++) {
			int index = ch[i] - 65;
			ar[index]++;
		}
		
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == 0) {
				System.out.println("It's not anagram");
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Its anagram");
		}
	}
}