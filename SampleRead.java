import java.io.*;

public class SampleRead{

    public static void main(String[] Args) throws IOException{
        int a;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str;
        str = br.readLine();        
        a = Integer.parseInt(str);
        System.out.println("Value Entered");

    }
}

