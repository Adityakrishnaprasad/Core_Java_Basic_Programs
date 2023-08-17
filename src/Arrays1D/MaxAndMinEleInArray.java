package Arrays1D;

public class MaxAndMinEleInArray {

	public static void main(String[] args) {
		int a[] = {12,13,15,17,19,21};
		int max=a[0]; // consider it as maximum value=12
		for(int i=1;i<a.length;i++) { //13,15,17,19,21
			if(a[i]>max) { //13>12T,15>13T,17>15T,19>17T,21>19T
				max=a[i];  // 13,15,17,19,21
				
			}
		}
		
		System.out.println("max ele in array is :"+max);

		
		
	  int min=a[0];
	  for(int i=1;i<a.length;i++) { 
			if(a[i]<min) { 
				min=a[i];  
				
			}
		}
	  System.out.println("min ele in array is :"+min);
	}

}
