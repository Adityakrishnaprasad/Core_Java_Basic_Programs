package Arrays1D;

import java.util.Arrays;

public class Finding3rdLargestNumberInArray {

	public static void main(String[] args) {
		int [] a = {5,9,6,4,15};
		int n=a.length;
		Arrays.sort(a);
		System.out.println("Array is : "+Arrays.toString(a));
		System.out.println("3rd largest element in an array is :"+a[n-3]);

	}

}
