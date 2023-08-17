package Collections_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {

	public static void main(String[] args) {
	  
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(19);
		a.add(15);
		a.add(17);
		a.add(21);
		a.add(13);
		
		System.out.println("before sorting arraylist is :"+a);
		
		//sorting arraylist in an order
		
		Collections.sort(a);
		System.out.println("after sorting arraylist is : "+a);
	}

}
