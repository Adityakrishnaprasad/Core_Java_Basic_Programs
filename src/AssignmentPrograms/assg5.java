package AssignmentPrograms;

public class assg5 {

	public static void main(String[] args) {
		double bill = 10000;
		double discount=0;
		double statement = (bill>10000) ? (discount = bill*10.0/100):(discount=bill*5.0/100);
		System.out.println(   " after discount the bill is : " + statement);

	}

}
