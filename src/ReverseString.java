//https://leetcode.com/problems/reverse-string/
public class ReverseString {
	public static void reverse(char[] s) {
        int start=0,end=s.length-1;
	    while(start<end)
	    {
            char temp=s[start];
	        s[start]=s[end];
	        s[end]=temp;
	        start++;
	        end--;
	    }
        for(char c:s)
			System.out.print(c+" ");
    }
	public static void main(String args[]) {
		char s[] = {'h','e','l','l','o'};
		reverse(s);
	}

}
