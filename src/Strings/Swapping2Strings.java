package Strings;

public class Swapping2Strings {

	public static void main(String[] args) {
		String name1="kittu";
		String name2="aditya";
		String swap="";
		System.out.println("before swapping names of strings is :");
		System.out.println(name1+" "+name2);
		System.out.println();
		swap=name1;
		name1=name2;
		name2=swap;
	
		System.out.println("After swapping names of strings is :");
		System.out.println(name1+" "+name2);
		

	}

}
