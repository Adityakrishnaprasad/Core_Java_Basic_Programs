package Operators;

public class RelationalAndLogicalOperator {

	public static void main(String[] args) {
		int a = 39;
		int b = 51;
		int c = 19;
		boolean d = true;
		boolean e = false ;
		boolean result1 = a>b && a>c; //  39>51 //false  
		boolean result2 = a>b || a>c; // 39>51 no  39>19 //true
		//boolean result3 = !(a>b && a>c); 
		//boolean result4 = !(a>b || a>c);
		System.out.println("the 1st result is " + result1);
		System.out.println("the 2nd result is " + result2);
		//System.out.println("the 3rd result is " + result3);
		//System.out.println("the 4th result is " + result4);
		

	}

}
