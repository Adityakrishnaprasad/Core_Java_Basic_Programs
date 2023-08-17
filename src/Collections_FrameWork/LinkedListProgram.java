package Collections_FrameWork;
import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
          
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(14);
		l.add(16);
		
		System.out.println(l);
		//read the data
		System.out.println(l.get(2));
		
		//update the data
		l.push(22);
		
	    //delete the data
		System.out.println(l.remove(2));
		
		System.out.println(l);
		
		
	}

}
