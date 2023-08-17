package Strings;

public class SerachStringPresenceInArray {

	public static void main(String[] args) {
		String s[] = new String[4];
		s[0]="aditya";
		s[1]="krishna";
		s[2]="prasad";
		s[3]="kittu";
		String search=s[3];
		for(int i=0;i<=s.length-1;i++) {
			if(s[i]==search) {
				System.out.println("searched string is present in string array"+" is : "+s[i]);
			}
		}
		

	}

}
