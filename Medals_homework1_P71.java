import java.util.Random;
import java.util.Scanner;

public class Medals_homework1_P71 {
	public static void main(String[] args) {
		
		Random run = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		final int size = sc.nextInt();
		
		int[] values = new int[size];
		System.out.println("Length = "+size);
		
	    for (int i=0; i<size; i++){
	        values[i] = run.nextInt(size);
	    }
	    

	    boolean inRun = false;
	    
	    for(int i=0 ; i<size ; i++) {
	    	if(inRun) {
	    		
	    		if(values[i+1] != values[i]) {
	    			System.out.print(" "+values[i]);
	    			System.out.print(" )");
	    		}
	    		inRun = false;
	    		continue;
	    	}
	    	if(!inRun) {
	    		if(i+1<size && values[i] == values[i+1]) {
	    			System.out.print(" (");
	    			System.out.print(" "+values[i]);
	    			inRun = true;
	    		}
	    		
	    	}
	    	System.out.print(" "+values[i]);
	    	
	    }
	    if(inRun) {
	    	System.out.print(") ");
	    	System.out.println();
	    }
		
	}
}
