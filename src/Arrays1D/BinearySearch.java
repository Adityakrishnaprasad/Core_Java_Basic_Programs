package Arrays1D;

import java.util.Arrays;

public class BinearySearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int key=100;
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		
		while(l<=h) {
			int m=(l+h)/2;
			if(a[m]==key) {
				System.out.println("element found");
				flag=true;
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		
		System.out.println("Approach 2");
		System.out.println("the index of the value is "+Arrays.binarySearch(a, 100));
		
		
	}
		
		

}
