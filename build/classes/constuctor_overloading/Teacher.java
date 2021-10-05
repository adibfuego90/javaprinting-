
package constuctor_overloading;

public class Teacher {
     String name,gender;
     int phone ;
     
     Teacher(){
         System.out.println("No value in this constructor");
     }
     Teacher(String n,int p){
         name=n;
         phone=p;
         
     }
     Teacher(String n,String g,int p){
         name=n;
         gender=g;
         phone=p;
         
         
     }
    void displayinfo(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Phone:"+phone);
    }
}
