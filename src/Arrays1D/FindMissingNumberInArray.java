package Arrays1D;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int a[] = {5,6,7,9,10,11};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
	
		int sum2=0;
		for(int i=5;i<=11;i++) {
			sum2=sum2+i;
			
		}
		
		int missingno = sum2-sum1;
		System.out.println(missingno);

	}

}
