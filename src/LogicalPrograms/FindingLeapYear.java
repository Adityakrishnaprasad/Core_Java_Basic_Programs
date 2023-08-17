package LogicalPrograms;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a year = ");
		int year =s.nextInt();
		if(year%400==0||(year%4==0 && year%100!=0))
			System.out.println(year+" "+"is a leap year");
		else
			System.out.println("it's not a leap year");
		
			

	}

}
