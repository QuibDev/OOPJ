import java.io.*;
import java.util.*;

public class SampleMath {
    public static void main(String[] Args) throws IOException{
        int a, b, c;
        float d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

    try {
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("Sum = "+c);
        c = a-b;
        System.out.println("Diff = "+c);
        c = a*b;
        System.out.println("product = "+c);
        d = a/b;
        System.out.println("Div = "+d);
    } catch (Exception e)  {
        System.out.println("Error : "+e.toString());
    }
}
