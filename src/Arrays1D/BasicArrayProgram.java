package Arrays1D;

import java.util.Arrays;

public class BasicArrayProgram {

	public static void main(String[] args) {
	   int [] a = new int [4];
	   a[0]=1;
	   a[1]=4;
	   a[2]=9;
	   a[3]=12;
	   int count=0;
	   
	   System.out.println(Arrays.toString(a));
	   
	   //get all values fromm array using for loop
	   
	   for(int i=0;i<a.length;i++) {
		   System.out.print(a[i]);
		   count++;
		   System.out.println();
	   }
	   System.out.println(count);
	   
	   System.out.println("using for each loop");
	   for(int x:a) {
		   System.out.print(x);
	   }

	}

}
