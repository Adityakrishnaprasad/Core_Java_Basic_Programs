package Arrays1D;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		int a [] = {23,56,98,23,65,44,98};
		
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
			   
				if(a[i]==a[j])
					
					System.out.println("duplicate elements in an array is :"+a[i]);
					
				 
			}
			
		}
		
	}

}
