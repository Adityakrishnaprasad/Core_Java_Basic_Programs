package LogicalPrograms;
import java.util.*;


//logic take no 6 and count all lowest numbers for 6
//and find how many lowest numbers are divisible by 6, if we add all those numbers which are divisible by 6 we need to get 6

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.println("enter a num = ");
        int num=s.nextInt();
        int sum=0;
        for(int i=1;i<num;i++) {
        	if(num%i==0) {
        		sum=sum+i;
        	}
        }
        if(num==sum)
        	System.out.println(num+" "+"is a perfect number");
        else
        	System.out.println("given number is not a perfect number");
        
        
	}

}
