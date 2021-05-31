////https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
public class DuplicateChar {  
     public static void main(String[] args) {  
        String str = "geeksforgeeks";  
        int count;  
        char st[] = str.toCharArray();  
        System.out.println("Duplicate characters in a given string: ");  
        for(int i = 0; i <st.length; i++) {  
            count = 1;  
            for(int j = i+1; j <st.length; j++) {  
                if(st[i] == st[j] && st[i] != ' ') {  
                    count++;    
                    st[j] = '0';  
                }  
            }  
            if(count > 1 && st[i] != '0')  
                System.out.println(st[i]+" "+count);  
        }  
    }  
}  