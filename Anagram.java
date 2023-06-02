import java.util.Arrays;

public class Anagram
{
	private static void sortArray(char[] x, char[] y, int size)
	{
		Arrays.sort(x);
		Arrays.sort(y);
		
		if(Arrays.equals(x, y)) {
			System.out.println("Given Strings are Anagram");
		}
		else {
			System.out.println("Given Strings are not Anagram");
		}
	}
	
	private static void getChar(String a, String b)
	{
		int size = (a.length()+b.length())/2;
		
		char[] ch1 = new char[a.length()];
		char[] ch2 = new char[b.length()];
		
		for(int i=0; i<size; i++) {
			ch1[i] = a.charAt(i);
			ch2[i] = b.charAt(i);
		}
		
		sortArray(ch1, ch2, size);
	}
	
	private static void getLength(String a, String b)
	{
		int size1 = a.length();
		int size2 = b.length();
		
		if(size1 == size2) {
			getChar(a,b);
		}
		else {
			System.out.println("Given Strings are not anagram");
		}
	}
	
	public static void main(String[] args) 
	{
		String a = "silent";
		String b = "listen";
		
		getLength(a.toLowerCase(), b.toLowerCase());
	}
}