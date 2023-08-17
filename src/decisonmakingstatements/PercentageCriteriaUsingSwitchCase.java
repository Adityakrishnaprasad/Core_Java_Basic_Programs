package decisonmakingstatements;

public class PercentageCriteriaUsingSwitchCase {

	public static void main(String[] args) {
		int englishpercentage=87;
		int mathspercentage = 82;
		int sciencepercentage = 85;
		int choice = 1;
		
		switch(choice) {
		case 1 :  if(englishpercentage>=80&&mathspercentage>=80&&sciencepercentage>=80)		 
			System.out.println("student can pick science branch");
		    break;
		
		case 2 : if(englishpercentage>=80&&mathspercentage>=60&&sciencepercentage>=80)
		System.out.println("student can pick degree");
		break;
		
		case 3 : if(englishpercentage>=60&&mathspercentage>=60&&sciencepercentage>=60)
			System.out.println(" student can eligible for small course");
		    break;
		    
		default : System.out.println("sorry candidate is not allowed to take any course")  ;
			
		}

	}

}
