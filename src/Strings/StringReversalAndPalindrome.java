package Strings;



public class StringReversalAndPalindrome {

	public static void main(String[] args) {
		
		 String s = "MALAYALAM";
	        String rev="";
	        System.out.println("....before reversal String is....");
	        System.out.println("   "+s+"   ");
	        for(int i=s.length()-1;i>=0;i--){
	            rev=rev+s.charAt(i);//
	        }
	        System.out.println("....after reversal String is....");
	        System.out.println("   "+ rev+"   ");
	        System.out.println();


	        if(s.equals(rev))
	            System.out.println("given string is palindrome");
	        else
	        	System.out.println("it's not a palindrome");



}
}
