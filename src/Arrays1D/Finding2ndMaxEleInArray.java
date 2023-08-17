package Arrays1D;

import java.util.Arrays;

public class Finding2ndMaxEleInArray {
	

	public static void main(String[] args) {
		int [] a = {5,9,6,4,15};
		int n=a.length;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[n-2]);
		
		
		
		
	}

}
