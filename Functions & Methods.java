import java.util.*;
import java.lang.*;

class HelloWorld {
    
    public static void printName(String name)
    {
        System.out.print("The winner is "+name);
        
    }
      public static int multiply(int a,int b)
    {
        int total=a*b;
        return total;
    }
    
    public static int calculate(int a,int b)
    {
        int total=a+b;
        return total;
    }
    public static int factorial(int a)
    {
        int total=1;
        for(int i=a;i>=1;i--)
        {
            total=total*i;
        }
        return total;
    }

    public static int PrintOdd(int n)
    {
        int total=0;
        
        for (int i=1;i<=n;i++)
        {
            if (i%2!=0)
            {
                total+=i;
            }
        }
        return total;
    }
    
    public static void main(String[] args) 
    {
        
        Scanner scanner=new Scanner(System.in);
        
        String name=scanner.nextLine();
        
        printName(name);
        
        int a=scanner.nextInt();
        int b = scanner.nextInt();
        
        // System.out.print("The sum is "+calculate(a,b));
         System.out.print("The product is "+multiply(a,b));
         System.out.print("The factorial is "+factorial(a));
        int n=scanner.nextInt();
        
        System.out.print("The sum of odd numbers is "+PrintOdd(n));
        
    }
}
