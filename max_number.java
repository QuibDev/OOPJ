
//read the element
//no. through command line args

import java.io.*;

public class max_number{

public static void main(String[] Args){
    int l, i, temp, max; 
    l = Args.length;
    

    System.out.println("\n Size: "+l);
    if (l>0){
        try {
            max = Integer.parseInt(Args[0]);    
            for (i=0;i<l;i++){
            temp = Integer.parseInt(Args[0]);
            if (max<temp){
                max = temp;
            }
    System.out.println("\nHighest Element: "+max);
    }
        }
        catch(Exception e){
            System.out.println("\nInvalid Input");
        }
    
    } else {
        System.out.println("\nInvalid Array must have more than 0 elements");
    }
}

}
