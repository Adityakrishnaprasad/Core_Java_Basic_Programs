package LogicalPrograms;

import java.util.Scanner;

public class AddingRangeOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter lower range number = ");
		int low = s.nextInt();
		System.out.print("enter higher range  number = ");
		int high = s.nextInt();
		int sum=0;
		for(int i=low;i<=high;i++) {
			sum=sum+i;
			System.out.println(i);
		}
		
		System.out.println("sum of the range of 2 numbers is :"+sum);

	}

}
