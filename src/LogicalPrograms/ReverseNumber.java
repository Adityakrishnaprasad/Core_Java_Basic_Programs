package LogicalPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num=s.nextInt();
		
		//1st approach using algorithm
		
		int rev=0;
		while(num!=0) {//9876!=0T, 987!=0T, 98!=0T, 9!=0T, 0!=0f it will comes out of the loop
			rev=rev*10+num%10;//0*10+9876%10=6, 6*10+987%10=678, 678*10+9%10=6789
			num=num/10;//9876/10=987, 987/10=98, 98/10=9, 9/10=0
		}
		System.out.println("reversed number after using looping statement is :"+rev);//6 7 8 9 = 6789;
		System.out.println();
		
		
		
		//2nd approach using StringBufferClass(using rev method)
		System.out.println("....2nd approach....");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num2=sc.nextInt();
		StringBuffer sb =new StringBuffer(String.valueOf(num2));
		StringBuffer reve = sb.reverse();
		System.out.println("reversed number after using stringbuffer is :"+reve);
		System.out.println();
		System.out.println("...3rd approach....");
		
		
		
		//3rd approach using StringBuilder class
		System.out.println();
		Scanner sr = new Scanner(System.in);
		System.out.print("enter a number:");
		int num3=sr.nextInt();
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num3);
		StringBuilder rev3=sb1.reverse();
		System.out.println("reversed number after using StringBuilder is :"+rev3);
		

	}

}
