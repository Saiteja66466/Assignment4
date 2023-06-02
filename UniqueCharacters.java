public class UniqueCharacters 
{
	private static boolean checkUnique(String a) {
		
		for(int i=0; i<a.length(); i++) {
			for(int j=i+1; j<a.length(); j++) {
				if(a.charAt(i) == a.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s1 = "abs";
		
		boolean res = checkUnique(s1);
		if(res) {
			System.out.println("String contains unique characters");
		}
		else {
			System.out.println("String doesn't contain unique characters");
		}
	}
}
