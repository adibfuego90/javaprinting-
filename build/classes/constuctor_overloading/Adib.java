
package constuctor_overloading;

public class Adib {
    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        Teacher teacher2=new Teacher("adib",013);
        teacher2.displayinfo();
        
        Teacher teacher3=new Teacher("adib","male",013);
        teacher3.displayinfo();
    }
    
}
