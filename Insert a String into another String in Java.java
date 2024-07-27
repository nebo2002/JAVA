import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        
        // String s="This is a java language";
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index = 4;
        
        String newstring=new String();
        
        for(int i=0;i<originalString.length();i++)
        {
            newstring+=originalString.charAt(i);
            
            if(i==index)
            {
                newstring+=stringToBeInserted;
            }
        }
        
        System.out.print(newstring);
        
        
        
        
        
        
    }
}
