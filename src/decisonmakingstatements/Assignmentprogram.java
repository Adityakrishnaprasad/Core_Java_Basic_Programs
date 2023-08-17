package decisonmakingstatements;

public class Assignmentprogram {

	public static void main(String[] args) {
		int weight = 900;
		char type= 'e';
	
	
		if(weight<=100&&type=='o') {
			System.out.println(" go for ordinary booking.... " + 80);
		}
		else if(weight<=100&&type=='e') {
			System.out.println("go for express booking....  " + 100);
		}
		if(weight>=101&&weight<=500&&type=='o') {
			System.out.println("go for ordinary booking... " + 150);
		}
		else if (weight>=101&&weight<=500&&type=='e')
		{
			System.out.println("go for express booking..... " +200);
		}
		if(weight>=501&&weight<=1000&&type=='o') {
			System.out.println("go for ordinary booking... " +210);
		}
		else if (weight>=501&&weight<=1000&&type=='e') {
			System.out.println("go for express booking..." +250);
		}
		if(weight>1000&&type=='o') {
			System.out.println("go for ordinary booking......." +250);
		}
		else if(weight>1000&&type=='e') {
			System.out.println("go for express booking....." + 300);
		}
		

	}

}
