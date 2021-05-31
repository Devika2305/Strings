//https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
public class PalindromeString {

	public static void main(String[] args) {
		String s = "abba";
		String w="";
		for(int i= s.length()-1;i>=0;i--) {
			w = w + s.charAt(i);
		}
		if(w.equals(s))
			System.out.println("String is a Palindrome");
		else
			System.out.println("String is not a Palindrome");

	}

}
