package LogicalPrograms;

import java.util.Scanner;

public class OddNumberProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		if(num%2!=0)
			System.out.println("it's an odd number");
		else
			System.out.println("it's an even number");

	}

}
