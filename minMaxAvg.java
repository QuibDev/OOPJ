//
//read the element
//no. through command line args

import java.io.*;

public class minMaxAvg{

public static void main(String[] Args){
    int l, i, temp, max,min, sum; 
    float avg;
    l = Args.length;
    sum = 0;

    System.out.println("\n Size: "+l);
    if (l>0){
        try {
            max = Integer.parseInt(Args[0]);
            min = Integer.parseInt(Args[0]);        
            for (i=0;i<l;i++){
            temp = Integer.parseInt(Args[i]);
            if (max<temp){
                max = temp;
            }
	    if (min > temp){
		min = temp;		
	    }
	    sum += Integer.parseInt(Args[i]);
		}	
    avg = sum/l;
    System.out.println("\nHighest Element: "+max);
    System.out.println("\nLowest Element: "+min);
    System.out.println("\nAverage Element: "+avg);
    }
    catch(Exception e){
            System.out.println("\nInvalid Input");
        }
    
    } else {
        System.out.println("\nInvalid Array must have more than 0 elements");
    }
}

}
