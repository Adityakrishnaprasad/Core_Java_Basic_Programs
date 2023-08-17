package Strings;

public class Basic {

	public static void main(String[] args) {
		//string is a collection of characters, it's a non primitive data type, pre-defined class
		String s = "ADITYA kittu";
		String s1 = "KITTU";
		System.out.println(s+s1);
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.contains(s1));
		System.out.println(s.contains("A"));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.concat(s1));
		System.out.println(s.replace('A', 'D'));
		System.out.println(s.replace("kittu","KITTU"));
		System.out.println(s.substring(0, 6));
		String hi = "hi@aditya@how@are@you";
		String a[]=hi.split("@");
		System.out.println(a[0]);
		//System.out.println(hi.split("@"));
		System.out.println(s.hashCode());
		System.out.println(s.toLowerCase());
			if(s.equals(s1)) {
				System.out.println("both are same");
			}
			else
				System.out.println("both are not same");
			
			String name = "  adityaa  ";
			System.out.println(name.length());
			System.out.println(name.trim().length());
			
			String name1 = "@aditya";
			System.out.println(name1.replace("@", ""));
			
		}
		
		
		
	}


