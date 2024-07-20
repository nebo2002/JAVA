import java.util.*;
import java.lang.*;

// Search element in the array
class HelloWorld {
    
    public static int SearchElement(int arr[],int n,int x)
    {
        for (int i=0;i<n;i++)
        {
            if (arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
    
        int n =scanner.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        
        System.out.print("Enter x:");
        int x=scanner.nextInt();
        System.out.print(SearchElement(arr,n, x));
     
     
    }
}
