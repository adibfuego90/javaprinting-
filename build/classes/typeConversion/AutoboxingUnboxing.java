
package typeConversion;

public class AutoboxingUnboxing {
    public static void main(String[] args ){
       int X=23;
       //Integer y =Integer.valueOf(X);
      // System.out.println("Y="+y);
       // Integer y=Integer.valueOf(X);
       // System.out.println("y="+y);
       //Integer Z= X;//this is auto boxing 
      // System.out.println(" Z =" +Z);
      Double d=new Double (4.5);
        System.out.println(d);
      double e=d.doubleValue();
      System.out.println("E="+e);
    }
}
