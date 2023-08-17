package LogicalPrograms;

import java.util.Scanner;

public class FindingFirstDigitInNumber {

	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		  System.out.print("enter a number = ");
		  int num=s.nextInt();
		 int cc=0;
		  while(num==0) {  // 5660=0F,
			  
			  cc=num%10; //5660%10=0;
			  num=num/10;//5660/10=566
		  }
		  
		  System.out.print(cc);

	}

}
