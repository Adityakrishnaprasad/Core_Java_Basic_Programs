package Arrays1D;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		
		
		int arr[] = {234,567,890,1190};
		System.out.println("approach 1");
		System.out.println("before sorting"+Arrays.toString(arr));
		
		Arrays.parallelSort(arr);
		
		System.out.println("After sorting"+Arrays.toString(arr));
		
		
		int arr1[] = {234,567,890,1190};
		System.out.println("approach 2");
		System.out.println("before sorting"+Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("After sorting"+Arrays.toString(arr1));
		
		
		System.out.println("approach 3 array sorted in descending order");
		Integer arr2[] = {234,567,890,1190};

		System.out.println("before sorting"+Arrays.toString(arr2));
		Arrays.sort(arr2,Collections.reverseOrder());
		System.out.println("After sorting"+Arrays.toString(arr2));
		
	}

}
