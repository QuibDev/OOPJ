import java.io.*;

public class table_of_N {

    public static void main(String[] Args) throws IOException{
        int n; 

        System.out.println("\nPlease Enter A Number (N): ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        n = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= 10; i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
        
        System.out.println("\n");

    }

}
