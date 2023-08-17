package decisonmakingstatements;

public class PercentageCriteriaForBranch {

	public static void main(String[] args) {
		int englishmarks =67;
		int mathsmarks = 62;
		int sciencemarks = 65;
		
	
	 if(englishmarks>=80&&mathsmarks>=80&&sciencemarks>=80)		 
			System.out.println("student can pick science branch");
	 else if (englishmarks>=80&&mathsmarks>=60&&sciencemarks>=80)
		 System.out.println("student can take biology");
	 else if(englishmarks>=60&&mathsmarks>=60&&sciencemarks>=60)
		 System.out.println("student can take commerce");
	 else
		 System.out.println("student doesnot meet criteria");
		
		
		

	}

}
