import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String fname="tony"; 
     
        String lname="stark"; 
        
        // concatenation
        String full=fname+" "+lname;
        
        
        System.out.println("The full name is: "+full);
        
        //  length of string
        System.out.println("The length of name is: "+full.length());
        
        // charAt()
        
        for(int i=0;i<full.length();i++)
        {
             System.out.println(full.charAt(i));
        }
        
        
        // string compare
        
        if (fname.compareTo(lname)==0)
        {
             System.out.print("strings are equal");
        }
        
        else if(fname.compareTo(lname)>0){
             System.out.println("string fname is bigger than lname");
        }
        else{
             System.out.print("string lname is bigger than fname");
        }
        
        
        // substring()
        
        String name="Captain America";
        
        // String myname=name.substring(0,7);
         String myname=name.substring(8);
        
        System.out.print(myname);

    }
}
