
package printing;


public class Teacher {
    String name,gander;
    int phone;
    Teacher(String n,String g,int p ){
        name=n;
        gander =g;
        phone=p;
    }
    
    void displayInformation(){
        System.out.println("Name:"+name);
        System.out.println("Gander:"+gander);
        System.out.println("Phone:"+phone);
        System.out.println("\n\n");
    }
   
    
    
}
