package LogicalPrograms;

import java.util.Scanner;

public class factorialProgram {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number for factorial: ");
      int num = sc.nextInt();//it will take user input from user
      int fact = 1;
      for(int i=1;i<=num;i++) {//1<=5T,2<=5T,3<=5T,4<=5T,5<=5T,6<=5False, it will comes out of the loop
    	  fact=fact*i;// 1*1=1,1*2=2,2*3=6,6*4=24,24*5=120
      }
      System.out.println(fact);//here it will print 120

	}

}
