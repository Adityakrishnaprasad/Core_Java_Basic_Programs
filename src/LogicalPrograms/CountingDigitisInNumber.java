package LogicalPrograms;

import java.util.Scanner;

public class CountingDigitisInNumber {

	public static void main(String[] args) {
	  Scanner s = new Scanner(System.in);
	  System.out.print("enter a number = ");
	  int num=s.nextInt();
	  int count=0;
	  while(num>0) {  
		  num=num/10; 
		  count++;
	  }
	  
	  System.out.println("no of digits in given number is "+count);
	  
	}

}
