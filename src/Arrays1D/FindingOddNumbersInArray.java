package Arrays1D;

public class FindingOddNumbersInArray {

	public static void main(String[] args) {
		int arr[]= {23,46,58,43,44};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
