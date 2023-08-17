package Arrays1D;

public class SumOfElementsInArray {

	public static void main(String[] args) {
		int sum=0;
		int a[] = {3,7,11,13,17};
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		

	}

}
