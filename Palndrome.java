import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        // String s="This is a java language";
        // String s="madam";
        String s="apple";
        
        int i=0;
        int j=s.length()-1;
        
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.print("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        
        System.out.print("Palindrome");
        
        
        
        
        
    }
}
