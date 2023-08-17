package UserInput;

import java.util.Scanner;

public class byte1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter byte value : ");
		byte A=s.nextByte();
		System.out.print("value of byte is : "+A);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter short value : ");
		short B = s.nextShort();
		System.out.print("value of short is :"+B);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter int value : ");
		int C=s.nextInt();
		System.out.print("value of int is :"+C);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter Long value : ");
		Long L=s.nextLong();
		System.out.print("value of Long is :"+L);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter float value : ");
	    float E = s.nextFloat();
		System.out.print("value of float is :"+E);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter Double value : ");
		double D = s.nextDouble();
		System.out.print("value of double is :"+D);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter boolean value : ");
		boolean bol = s.nextBoolean();
		System.out.print("value of boolean is :"+bol);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter char value : ");
		char ch = s.next().charAt(0);
		System.out.print("value of char is :"+ch);
		System.out.println();
		System.out.println("..................");
		
		System.out.print("enter String value : ");
         //String str = s.next();//for single word
         String str1 = s.nextLine();
		System.out.print("value of String is :"+str1);
		System.out.println(str1);
		System.out.println();

	}

}
