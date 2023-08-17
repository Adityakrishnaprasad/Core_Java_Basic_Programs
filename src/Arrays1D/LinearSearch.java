package Arrays1D;

public class LinearSearch {

	public static void main(String[] args) {
		int a[] = {12,13,15,17,19,21};
		int searchele = 19;
		boolean flag=false;
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			
			if(searchele==a[i]) {
				System.out.println(searchele +" "+ "is found in given array" +" "+"at index" +" "+ i);
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		System.out.println("element not found");

	}

}
