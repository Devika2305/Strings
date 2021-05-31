//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
public class StringRotation {
	public static void main(String args[]) {
		String s1 = "ABCD";
		String s2 = "CDAB";
		String temp = s1.concat(s1);
		if(temp.indexOf(s2)!=-1)
			System.out.println("Strings are rotations of each other");
		else
			System.out.println("Strings are not rotations of each other");
	}
	

}
