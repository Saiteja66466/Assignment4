public class MaxOccurringCharacter{
	public static void main(String[] args) 
	{
		String s1 = "abccd";
		int maxCount = 0;
		char maxChar = ' ';
		
		int[] charCount = new int[256];
		
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
		
		for (int i = 0; i < s2.length(); i++) {
            charCount[s2.charAt(i)]++;
        }
		
		for(int i=0; i<s2.length(); i++) {
			if (charCount[s2.charAt(i)] > maxCount) {
                maxChar = s2.charAt(i);
                maxCount = charCount[s2.charAt(i)];
            }
		}
		
		System.out.println("The maximum occured character is " + maxChar);
		
	}
}