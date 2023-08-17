package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
	 
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		
		}
		if(count==2)
			System.out.println("given number is prime number");
		else
			System.out.println("it's not a prime number");

	}

}
