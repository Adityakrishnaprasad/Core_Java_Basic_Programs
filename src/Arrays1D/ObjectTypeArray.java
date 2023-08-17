package Arrays1D;



public class ObjectTypeArray {

	public static void main(String[] args) {
		Object [] a = new Object[5];
		a[0]=12;
		a[1]=45.98;
		a[2]="hello";
		a[3]='a';
		a[4]=true;
		
		System.out.println("....using for loop....");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("....using for-each loop....");
		for(Object z:a) {
			System.out.println(z);
		}
		

	}

}
