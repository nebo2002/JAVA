
// If Else

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /***Don't change the code here***/
        
        Scanner inp  = new Scanner(System.in);
        int M = inp.nextInt();
        inp.close();
        /*********************************/
        
        /**Write your code here**/
        
        if (M%3==0 && M%5==0)
        {
            System.out.println("Good Number");
        }
        
        else if (M%3==0)
        {
            System.out.println("Bad Number");
        }
        
        else if (M%5==0)
        {
            System.out.println("Poor Number");
        }
        
        else
        {
            System.out.println("-1");
        }

    }
}


// loops

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /***Don't change the code here***/
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.close();
        /***********************************/
        
        
        /***Your code goes here***/
        
        for (int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
        
        
    }
}

// methods

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        /*Dont't touch the code in this block*/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
        System.out.println(add(a,b));
        System.out.println(multiply(a,b));
        /*******************************************/
    }
    
    //Your code goes here
    
    public static int add(int a, int b)
    {
        int res=a+b;
        return res;
    }
    
    public static int multiply(int a,int b)
    {
        int mul=a*b;
        
        return mul;
    }
    
    
    
}
