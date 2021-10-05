
package Method;

import java.util.Scanner;

public class Main {
    public static void main(String []args ){
        Scanner input=new Scanner (System.in );
        
        Operation operation=new Operation ();
        
        int a ,b,sum;
        
        System.out.println("Enter the value of a:");
        a=input.nextInt();
        System.out.println("Enter the value of b:");
        b=input.nextInt();
        
        sum=operation.sum(a, b);
        System.out.println("Sum of "+a+"and"+b+"="+sum);
        
        
    }
    
}
