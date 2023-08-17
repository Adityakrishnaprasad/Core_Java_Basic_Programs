package Arrays1D;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr [] = {23,67,34,12,8};
		System.out.println("before sorting"+Arrays.toString(arr));
		int n=arr.length;
		for(int i=0;i<n-1;i++) {  // no of passes
			for(int j=0;j<n-1;j++) { // comparing and swapping elements
				if(arr[j]>arr[j+1]) {  //if 1st element is greater than 2nd one we need to swap it
					int temp=arr[j]; 
					arr[j]=arr[j+1]; 
					arr[j+1]=temp;
				
				}
			}
		}
		System.out.println("after sorting"+Arrays.toString(arr));
	}

}
