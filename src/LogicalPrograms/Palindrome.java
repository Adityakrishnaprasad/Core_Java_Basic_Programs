package LogicalPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter random number :");
		int num=s.nextInt();
		int onum=num;
	    int rev=0;
		
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
         System.out.println("reversed number is :"+rev);
         
         //checking whether given number is palindrome or not
         if(onum==rev)
        	 System.out.println(onum+" "+"is a palindrome number");
         else
        	 System.out.println("given number is not a palindrome");
	}

}
