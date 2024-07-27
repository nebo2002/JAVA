import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        // String s="This is a java language";
        String s="i am GFG";
        
        // split the sentence
        String[] words=s.split(" ");
        
        // for each loop
        for(String word:words)
        {
            int len=word.length();
            
            if (len%2==0)
            {
                System.out.print(word+" ");
            }
        }
        
    }
}
