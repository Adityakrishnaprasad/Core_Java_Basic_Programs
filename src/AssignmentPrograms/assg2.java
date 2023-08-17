package AssignmentPrograms;

public class assg2 {

	public static void main(String[] args) {
		int distancetravelled=21;

		int fare;
		if(distancetravelled==10) {
			fare=80;
			System.out.println("fare for the distance is : " +fare+"km");
		}
		else if (distancetravelled>11||distancetravelled<20) {
			fare=6;
			System.out.println("fare for the distance is : " +fare+"km");
		}
		else if (distancetravelled>21&&distancetravelled<30) {
			fare=5;
			System.out.println("fare for the distance is : " +fare+"km");
		}
		else if(distancetravelled>31) {
			fare=4;
			System.out.println("fare for the distance is : " +fare + "km");
		}
		else {
			System.out.println("invalid data..........");
		}
	}

}
