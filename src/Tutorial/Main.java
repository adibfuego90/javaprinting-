
package Tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
       String name;
       System.out.print("Enter your name:");
       name=input.nextLine();
       int id;
        System.out.print("Enter your id:");
        id=input.nextInt();
        System.out.println("name:\n"+name+"Id:\n"+id);
    }
    
}
