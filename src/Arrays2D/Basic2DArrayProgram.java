package Arrays2D;

public class Basic2DArrayProgram {

	public static void main(String[] args) {
		int [][] a = new int [3][2];
		a[0][0]=100;
		a[0][1]=222;
		
		a[1][0]=333;
		a[1][1]=456;
		
		a[2][0]=523;
		a[2][1]=610;
		System.out.println(".....using for loop.........");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("......using enhanced for loop....");
		for(int []x:a) {
			for(int arr:x) {
				System.out.print(arr+"  ");
			}
			System.out.println();
		}

	}

}
