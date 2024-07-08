import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader object to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read the first integer from the input
        int toRead = Integer.parseInt(reader.readLine());
        
        // Read the second integer from the input
        int toRead1 = Integer.parseInt(reader.readLine());
        
        // Print the two integers in a space-separated manner
        System.out.print(toRead + " " + toRead1);
    }
}

// data types
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*
        Assign values to the following variable as described above
        Don't change the variable name
        */
        String mystring1;
        String mystring2;
        int myint;
        boolean myboolean;
        
        mystring1="InterviewBit";
        mystring2="Don't change the variable name";
        myint=11;
        myboolean=true;
        
        
        
        /*Don't change the code below*/
        System.out.println("String1 = " + mystring1);
        System.out.println("String2 = " + mystring2);
        System.out.println("int = " + myint);
        System.out.println("boolean = " + myboolean);
        
    }
}
// operators
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    
    /***Don't change anything here***/
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        inp.nextLine();
        int b = inp.nextInt();
        inp.nextLine();
        inp.close();
    /*********************************/
    
    /*Perform the task here*/
        
        int add;
        int sub;
        int multi;
        int div;
        
        add=a+b;
        sub=a-b;
        multi=a*b;
        div=a/b;
        
    /***********************/
    
    /******Don't change anything here******/
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(div);
    
    }
}
