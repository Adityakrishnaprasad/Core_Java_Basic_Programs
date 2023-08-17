package Collections_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {

	public static void main(String[] args) {
		  
				ArrayList<Integer> a = new ArrayList<Integer>();
			     
			     //for adding elements in arraylist
			     a.add(10);
			     a.add(16);
			     a.add(14);
			     System.out.println(a);
			     
			     //to get elements
			     
			       int a1=a.get(0);
			       System.out.println(a1);
			       
			     //add elements using index
			       
			    a.add(1, 12);
			    System.out.println(a);
			    
			    //set or change element in arraylist
			    
			    a.set(0, 8);
			    System.out.println(a);
			    
			    //remove element
			    
			       a.remove(0);
			       System.out.println(a);
			       
			       //size of an arraylist
			       
			       a.size();
			       System.out.println(a);
			       
			       //loops
			       
			       for(int i=0;i<a.size();i++) {
			    	   System.out.print(a.get(i)+" ");
			    	   System.out.println();
			       }

			       
			       //sorting
			       
			       Collections.sort(a);
			       System.out.println(a);
		     

	}

}
