package Methods;

public class ParamsMain {

	public static void main(String[] args) {
		ParamsWithAndWithoutReturnValues pwr = new ParamsWithAndWithoutReturnValues();
		pwr.returning(5, 6);
		int var = pwr.returning2(20, 60);
		System.out.println(var);

	}

}
