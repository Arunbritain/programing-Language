
import java.util.*;
import java.lang.*;

public class vowrevm{
     public static void main(String aa[]){
      int a;
     String h;
     Scanner s=new Scanner(System.in);
     h=s.next();
     String j=h.replaceAll("[AEIOUaeiou]", "");
     String n=new StringBuilder(j).reverse().toString();
     System.out.println(n);
     

    }
}
