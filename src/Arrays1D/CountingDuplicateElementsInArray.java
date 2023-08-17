package Arrays1D;

public class CountingDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int [] a = {12,15,19,21,12,25,17,19};
		int count=0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				count++;
			}
		
		}
          System.out.println("count of duplicate elements in array is : ");
	}

}
