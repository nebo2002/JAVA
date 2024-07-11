// ****
// ****
// ****
// ****

import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        int n =scanner.nextInt();
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            
            System.out.print('\n');
        }
    }
}


// *****
// *   *
// *   *
// *****

import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        int n =4;
        int m=5;
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=m;j++)
            {
                if (i==1 || j==1 || i==n || j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}


// *
// **
// ***
// ****
import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        

        
        int n =4;
        // int m=5;
        
      for (int i=1;i<=n;i++)
      {
          for (int j=1;j<=i;j++)
          {
              System.out.print("*");
          }
          
          System.out.println();
      }
    }
}

// ****
// ***
// **
// *

import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) {
        

        
        int n =4;
        // int m=5;
        
      for (int i=n;i>=1;i--)
      {
          for (int j=i;j>=1;j--)
          {
              System.out.print("*");
          }
          
          System.out.println();
      }
    }
}

//    *
//   **
//  ***
// ****
import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) 
    {
        int n=4;
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// 1
// 12
// 123
// 1234

import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) 
    {
        int n=4;
        int count=1;
        
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            count=1;
            
            System.out.println();
        }
    }
}

// 12345
// 1234
// 123
// 12
// 1


import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) 
    {
        int n=5;
        int count=1;
        
        for (int i=n;i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(count);
                count++;
            }
            count=1;
            
            System.out.println();
        }
    }
}

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 


import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) 
    {
        int n=5;
        int count=1;
        
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(count);
                System.out.print(" ");
                count++;
            }
          
            System.out.println();
        }
    }
}

// 1
// 01
// 101
// 0101

import java.util.*;
import java.lang.*;

class HelloWorld {
    public static void main(String[] args) 
    {
        int n=4;
        int count=1;
        
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                int sum=(i+j);
                
                if (sum%2==0)
                {
                    System.out.print('1');
                }
                else
                {
                    System.out.print('0');
                }
               
            }
            System.out.println();
        }
    }
}


